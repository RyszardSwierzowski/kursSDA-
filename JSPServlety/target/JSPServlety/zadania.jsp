<%@ page import="java.util.Random" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: rysza
  Date: 16.03.2019
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--zadabie 1--%>
<ol>
    <%
        Random random = new Random();
        for(int i=0; i<5;i++){
    %>
    <li>Wylosowano:<%=random.nextInt(1001)%></li>
    <%}%>
</ol><br>
<%--zadanie 2--%>
<%
    LocalDateTime now = LocalDateTime.now();

%>

<div ><%=now%></div><br><br>


<%--zadanie3--%>

<%
Map<String,String[]> mapa = request.getParameterMap();

for(Map.Entry<String,String[]> entr: mapa.entrySet()){ %>
    <p><%=entr.getKey() + "/" + Arrays.toString(entr.getValue())%></p>
<%
}

%>



<%--zadanie4--%>
<%
    // Set refresh, autoload time as 5 seconds
    response.setIntHeader("Refresh", 1);

    // Get current time
    LocalDateTime now2 = LocalDateTime.now();


    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();

    out.print(hour+":"+minute+":"+second);
%>






</body>
</html>
