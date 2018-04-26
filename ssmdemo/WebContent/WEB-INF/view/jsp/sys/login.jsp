<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    String path = request.getContextPath(); 
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=basePath%>sys/login" method="post">
		<table align="center">
			<tr><td>用户名</td><td><input type="text" name="userName"/></td></tr>
			<tr><td>密码</td><td><input type="password" name="passWord"/></td></tr>
			<tr><td>生日</td><td><input type="text" name="userBirthday"/></td></tr>
			<tr><td>薪水</td><td><input type="text" name="userSalary"/></td></tr>
			<tr><td colspan="1"><button type="submit">Login</button></td></tr>
		</table>
	</form>
</body>
</html>