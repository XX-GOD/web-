<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user/register" method="post" name="registForm">
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="uname" value="${user.uname }" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="upass" /></td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input type="password" name="reupass" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="注册" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>