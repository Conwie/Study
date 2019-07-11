package controller;

import javax.servlet.http.HttpServletRequest;

import base.common.RequestMapping;

public class LoginController {
	@RequestMapping("/toLogin.do")
	public String toLogin() {
		System.out.println("LoginController's toLogin");
		return "login";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request) {
		System.out.println("LoginController's login");
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		if("Conwie".equals(username) && "123321".equals(pwd)) {
			//登录成功
			/*
			 * 如果视图名是以"redirect:"开头，
			 * 表示重定向。
			 */
			return "redirect:toSuccess.do";
		}else {
			//登录失败 
			
			request.setAttribute("msg", "用户名或密码错误");
			return "login";
		}
	}
	
	@RequestMapping("/toSuccess.do")
	public String toSuccess() {
		return "success";
	}
	
	
}
