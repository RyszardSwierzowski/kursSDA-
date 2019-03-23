<%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 16.03.2019
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>kalkulator</title>
</head>
<body>

<form action="Kalkulator" method="post">
    <input type="text" name="liczbaA"><br>
    <input type="text" name="liczbaB"><br>
    + <input type="radio" name="dzialanie" value="+"><br>
    - <input type="radio" name="dzialanie" value="-"><br>
    * <input type="radio" name="dzialanie" value="*"><br>
    / <input type="radio" name="dzialanie" value="/"><br>

    <input type="submit" value="Licz"><br>
</form>


</body>
</html>
