<%@ page import="java.util.List" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>SignIn</title>
    <link rel="stylesheet" href="/css/logowanie.css" type="text/css">

</head>


<!--               HEAD / BODY -->

<body>

<div id="logowanie">
    <h2>Logowanie</h2>
    <form action="logowanie" method="post" class="form">
        <label><input type="text" name="userName" placeholder="login (litery i cyfry)" minlength="6" maxlength="15" pattern="[A-Za-z0-9]+" required class="text-field"></label> <br><br>
        <label><input type="password" name="password" placeholder="hasło" minlength="6" maxlength="15" required class="text-field"></label> <br><br><br>
        <input type="submit" value="Zaloguj się" class="button" id="button_Sing_In">
    </form>

    <form action="<c:url value="signUp.jsp"/>" , method="get" class="form">
        <input type="submit" value="Rejestracja" class="button" id="button_Sign_Up">
    </form>
</div>


</body>

</html>
