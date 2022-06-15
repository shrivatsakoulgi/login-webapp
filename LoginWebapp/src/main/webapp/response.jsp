<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body>

<h1>This is Response Page </h1>

<%
boolean status=(Boolean)request.getAttribute("status");
if(status){
	%>
	
	<h2 style="color:green"> Login Success...Welcome</h2>
	<%
}else {
	
	%>
	<h2 style="color:red"> Login Failure...Login again</h2>
	<%
}

%>
</body>
</html>