<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 23.03.2019
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>rejestracja</title>
    <link rel="stylesheet" href="/css/rejestracja.css" type="text/css">
</head>
<body>

<div id="rejestracja">
    <h2>Rejestracja</h2>
    <form action="logowanie" method="post" class="form">
        <label><input type="text" name="userName" placeholder="login (litery i cyfry)" minlength="6" maxlength="15" pattern="[A-Za-z0-9]+" required class="text-field"></label> <br><br>
        <label><input type="password" name="password" placeholder="hasło" minlength="6" maxlength="15" required class="text-field"></label> <br><br>
        <label><input type="password" name="RepeatPassword" placeholder="powtórz hasło" minlength="6" maxlength="15" required class="text-field"></label> <br><br>
        <label><input type="email" name="email" placeholder="adres e-mail" class="text-field" required></label><br><br>
        <label><input type="email" name="repeatEmail" placeholder=" powtórz adres e-mail" class="text-field" required></label><br><br>
        <label> <input type="checkbox" name="zgoda" required> <span id="zgoda">Wyrażam zgodę na przetwarzanie danych</span> </label><br><br>
        <input type="submit" value="Zarejestruj się" class="button" id="button_Sign_Up"><br>

    </form>

    <form action="<c:url value="index.jsp"/>" , method="get" class="form" >
        <input type="submit" value="Powrót" class="button" id="button_Back">
    </form>
    <p>
        <b>login</b> powienien zawierać tylko litery i cyfry i posiadać między 6,a 12 znaków <br><br>
        <b>hasło</b> powinno zawierać między 6,a 12 znaków
    </p>
</div>


</body>
</html>
