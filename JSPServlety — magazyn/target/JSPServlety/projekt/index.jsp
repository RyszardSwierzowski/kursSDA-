<%@ page import="java.util.List" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
        <head>
            <title>SignIn</title>
            <link rel="stylesheet" href="logowanie.css">
        </head>


<!--               HEAD / BODY -->

        <body>

<div id="logowanie">
    <form action="logowanie" method="post">
        <label><input type="text" name="userName" required></label> <br>
        <label><input type="password" name="password" required></label> <br>
        <input type="submit" value="Zaloguj się">
    </form>
    <form action="rejestracja", method="get">
        <input type="submit" value="Rejestracja">
    </form>
</div>





        </body>

</html>
