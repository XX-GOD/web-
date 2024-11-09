<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="multifile" method="post" enctype="multipart/form-data">  
    选择文件1:<input type="file" name="myfile">  <br>
    文件描述1:<input type="text" name="description"> <br>
    选择文件2:<input type="file" name="myfile">  <br>
    文件描述2:<input type="text" name="description"> <br>
    选择文件3:<input type="file" name="myfile">  <br>
    文件描述3:<input type="text" name="description"> <br>
 <input type="submit" value="提交">   
</form> 
</body>
</html>
