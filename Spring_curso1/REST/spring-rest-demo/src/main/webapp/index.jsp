<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
    <h3>Spring rest demo</h3>

    <hr>

    <a href="${pageContext.request.contextPath}/test/hello">Hello</a>

    <br>

    <a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
</body>
</html>
