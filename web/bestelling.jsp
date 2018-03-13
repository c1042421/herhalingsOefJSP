<%-- 
    Document   : bestelling
    Created on : 13-mrt-2018, 14:00:37
    Author     : c1042421
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="hbo5.it.www.beans.Bestelling"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div {
                border: 1px solid black;
                padding: 5px;
                margin-bottom: 5px;
            }
        </style>
    </head>
    <body>
        <%
            ArrayList<Bestelling> bestellingen = (ArrayList<Bestelling>) session.getAttribute("bestellingen");
        %>
        <h1>Bestelling</h1>

        <% for (Bestelling bestelling : bestellingen) {%>
        <div>
            <p> <%= bestelling.toString() %></p>
            <p> <%= bestelling.getBroek().toString()%> </p>
            <p> met als totale verkoopprijs: <%= bestelling.getVerkoopprijs()%></p>
            <p> De leverdatum: <%= bestelling.getLeverdatum()%> </p>
        </div>   
        <%}%>

        <a href="index.jsp">terug</a>
    </body>


</html>
