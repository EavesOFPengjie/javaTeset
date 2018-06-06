<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<h1>登陆界面</h1>
	<form action="/spring_mybatis_testf/login" method="POST">
		<input type="text" /> <input type="text" /> <input type="submit"
			value="登录" />
	</form>

	 
	<h2>user infomation</h2>
	<p>userid：${userid}</p>
	<p>username:${username}</p>
	<p>工号：${deptno}</p>
	<p>姓名:${ename}</p>
	<p>薪水:${sal}</p>
</body>
</html>