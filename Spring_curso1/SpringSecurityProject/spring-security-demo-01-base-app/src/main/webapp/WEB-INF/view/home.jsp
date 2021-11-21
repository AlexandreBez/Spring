<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Company Home</title>
</head>
<body>
    <h2>Company Home Page</h2>
	
	<p>Lorem Ipsulum</p>
	
	<hr>
	
	<p>
		User: <security:authentication property="principal.username"/>
		<br><br> 
		Roles(s): <security:authentication property="principal.authorities"/>
	</p>
	
	<hr>

	<security:authorize access="hasRole('MANAGER')">

		<p>
			<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
			(Only for Managers)
		</p>
	
	</security:authorize>
    
	<security:authorize access="hasRole('ADMIN')">

		<p>
			<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a>
			(Only for IT Managers)
		</p>
	
	</security:authorize>

    <form:form action="${pageContext.request.contextPath}/logout" method="POST">
    	
    	<input type="submit" value="Logout" />
    </form:form>
    

</body>
</html>
