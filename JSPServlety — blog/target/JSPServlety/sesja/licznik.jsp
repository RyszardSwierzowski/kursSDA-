<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 17.03.2019
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>licznik</title>
</head>
<body style="background-color: gray">

Liczba klikniec:

<c:out value="${sessionScope.containsKey(wynik)}"></c:out>
<form action="/Licz" method="post">
    <input type="submit" value="licz">
</form>



</body>
</html>
