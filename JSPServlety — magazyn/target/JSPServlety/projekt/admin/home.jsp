<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 24.03.2019
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
    <link rel="stylesheet" href="/css/homePage.css" type="text/css">
</head>
<body>

<nav>    <jsp:include page="navBar.jsp" />      </nav>
<p>Witaj w magazynie dla admina <C:out value="${user.getLogin()}"></C:out></p>





</body>
</html>
