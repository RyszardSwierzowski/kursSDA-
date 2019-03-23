<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 17.03.2019
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logowanie</title>
</head>
<body style="background-color: #a1a9b0">
<div style="position: center ;background-color: black">
    <div style="position: center ;background-color: red ; display: inline; width: 300px">
        <form action="<c:url value="/loguj"/>" method="post">
            <input type="text" name="userName" placeholder="login"> <br>
            <input type="password" name="password" placeholder="password"><br>
            <input type="submit" value="zaloguj"><br>

        </form>
    </div>


</div>


</body>
</html>
