package base.web;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import base.common.Handler;
import base.common.HandlerMapping;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private HandlerMapping handlerMapping;
	public void init() throws ServletException {
		
		try {
			/*
				 * 读取smartmvc配置文件中处理器的配置信息，
				 * 然后利用java反射将处理器实例化。
				 */
			SAXReader reader = new SAXReader();
			InputStream in = getClass().getClassLoader().getResourceAsStream("smartmvc.xml");
			Document doc = reader.read(in);
			Element rootElement = doc.getRootElement();
			List<Element> elements = rootElement.elements();
			//beans用来存放处理器实例
			List beans = new ArrayList();
			for (Element ele : elements) {
				//读取处理器类名
				String className = ele.attributeValue("class");
				System.out.println("className:" + className);
				//将处理器实例化
				Object bean = Class.forName(className).newInstance();
				beans.add(bean);
			}
			System.out.println("beans:" + beans);
			
			//创建映射处理器实例
			handlerMapping = new HandlerMapping();
			/**
			 * 调用映射处理器的process方法，该方法
			 * 利用java反射读取@RequestMapping中
			 * 的请求路径，然后建立请求路径与处理器的
			 * 对应关系。
			 */
			
			handlerMapping.process(beans);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  request.setCharacterEncoding("utf-8");
	  /*
	   * 先获得请求资源路径，然后截取请求资源路径的一部分
	   * 生成请求路径(path),接下来，调用HandlerMapping
	   * 的getHandler方法来获得Handler对象。最后利用
	 * Handler对象来调用处理器方法。
	   */
	  	String uri = request.getRequestURI();
	  	System.out.println("uri:" + uri);
	  		//截取请求资源路径的一部分(除掉应用名)，
	  		//生成请求路径
	  	String contextPath = request.getContextPath();
	  	System.out.println("contextPath:" + contextPath);
	  	String path = uri.substring(contextPath.length());
	  	System.out.println("path:" + path);
	  		//依据请求路径找到对应的Handler对象。
	  	Handler handler = handlerMapping.getHandler(path);
	  	System.out.println("handler:" + handler);
	  	if(handler==null) {
	  		return;
	  		}
	  		//利用handler对象，调用处理器的方法
	  	Method mh = handler.getMh();
	  	Object bean = handler.getObj();
	  	//rv是处理器方法的返回值(即视图名)。
	  	Object rv = null;
	  	try {
	  		/*
	  		 * 调用处理器的方法。
	  		 * 先判断处理器方法带不带参（可以
	  		 * 通过Method对象提供的getParameterTypes
	  		 * 方法来获知）。
	  		 */
	  		Class[] types = mh.getParameterTypes();
	  		if(types.length == 0) {
	  				//调用不带参的方法
	  				rv = mh.invoke(bean);
	  		}else {
	  				//params数组用于存放实际参数值
	  			Object[] params = new Object[types.length];
	  				/*
	  				 * 目前只支持在处理器方法当中添加
	  			* request和response作为参数。
	  				 */
	  			for(int i=0;i<types.length;i++) {
	  				if(types[i] == HttpServletRequest.class) {
	  					params[i] = request;
	  					}
	  				if(types[i] == HttpServletResponse.class) {
	  					params[i] = response;
	  					}
	  				}
	  				//调用带参的方法
	  			rv = mh.invoke(bean,params);
	  			}
	  		System.out.println("rv:" + rv);
	  		String viewName = rv.toString();
		  		/*如果视图名是以"redirect:"开头，
		  		 * 则重定向。否则转发。
		  		 */
	  		if(viewName.startsWith("redirect:")) {
	  				/*
	  				 * 依据视图名，生成重定向地址
	  				 * (要将"redirect:"除掉)。
	  				 */
	  			String redirectPath = contextPath + "/" + viewName.substring("redirect:".length());
	  			//重定向
	  			response.sendRedirect(redirectPath);
	  		}else{
	  			/*
	  			 *依据视图名，定位到某个jsp
	  		 *"/WEB-INF/" + 视图名 + ".jsp";
	  			 */
	  		String jspPath = "/WEB-INF/" + rv + ".jsp";
	  			//转发
	  		request.getRequestDispatcher(jspPath).forward(request, response);
	  			}
			} catch (Exception e) {
				e.printStackTrace();
			}
  }

}
