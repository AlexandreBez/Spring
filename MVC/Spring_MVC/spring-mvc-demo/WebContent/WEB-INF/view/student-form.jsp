<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>student form</title>
</head>
<body>
    <form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName">

        <br>

        First name: <form:input path="lastName">

        <br>

        Country:

        <form:select path="contry">
            <form:option items="${student.countryOptions}" />
        </form:select>
        
        <br>

        Favorite Language:

        Java <form:radiobutton path="favoriteLanguage" value="Java" />
        C# <form:radiobutton path="favoriteLanguage" value="C#" />
        PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

        <br>

        Operating System:

        Linux <form:checkbox path="operatingSystem" value="Linux" />
        Microsoft <form:checkbox path="operatingSystem" value="Microsoft" />
        Mac <form:checkbox path="operatingSystem" value="Mac" />

        <br>

        <input type="submit" value="submit">
    </form>
</body>
</html>
