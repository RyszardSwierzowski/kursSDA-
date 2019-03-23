<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 23.03.2019
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj post</title>
</head>
<body>

<form action="/addPost" method="post">
    <label>Tytuł posta:  <input type="text" name="title"></label><br>
    <label>Zawartość posta: <textarea name="content"></textarea></label><br>
    <input type="submit" value="dodaj nowy post"><br>
</form>

</body>
</html>
