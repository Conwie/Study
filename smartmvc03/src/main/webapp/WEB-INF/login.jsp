<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
		<fieldset>
			<legend>登录</legend>
			用户名:<input name="username"/><br/>
			密码:<input type="password" name="pwd"/><br/>
			<span style="color:red;">${msg }</span><br/>
			<input type="submit" value="登录"/>
		</fieldset>
	</form>
</body>
</html>