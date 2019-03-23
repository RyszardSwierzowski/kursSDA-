<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<meta charset="UTF-8">
<body>


<% String s = "Witaj na stronie !"; %>
<%=s%>
<% s = "Żegnaj !"; %>
<%=s%>

<%
    List<Integer> liczby = new ArrayList<>();
    liczby.add(100);
    liczby.add(100000);
    liczby.add(230000);


    for (int i = 0; i < liczby.size(); i++)
    { %>
        <p><%=liczby.get(i)%></p>
    <%}
%>


</body>
</html>
