<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>done</title>
</head>
<body>

    The student is confirmed: ${student.firstName} ${student.lastName}

    Country: ${student.getCountry}

    Language: ${student.favoriteLanguage}

    OS: 
    <ul>
        <c:foreach var="temp" items="${student.operatingSystem}">

            <li>${temp}</li>

        </c:foreach>
    </ul>

</body>
</html>
