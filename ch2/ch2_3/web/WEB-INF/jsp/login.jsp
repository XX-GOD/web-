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
	<form action="user/login" method="post">
		<table>
			<tr>
				<td align="center" colspan="2">登录</td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="upass"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"> <input
					type="reset" value="重置"></td>
			</tr>
		</table>
		${messageError }
	</form>
</body>
</html>