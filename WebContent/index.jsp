<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/insertSYSUser"
		method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="username" type="text" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>