<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Form</title>
    <style>
        .error {color: red;}
    </style>

</head>
<body>

    <form:form action="processForm" modelAttribute="customer" >
        First name: <form:input path="firstName" />

        <br>

        Last name*: <form:input path="firstName" />
        <form:errors path="lastName" cssClass="error" />

        <br>

        Free passes: <form:input path="freePasses" />
        <form:errors path="freePasses" cssClass="error" />

        <br>

        Postal Code: <form:input path="postalCode" />
        <form:errors path="postalCode" cssClass="error" />

        <br>

        Course Code: <form:input path="courseCode" />
        <form:errors path="courseCode" cssClass="error" />

        <br>

        <input type="submit" value="submit">

    </form:form>

</body>
</html>
