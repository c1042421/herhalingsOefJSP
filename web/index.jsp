<%-- 
    Document   : index
    Created on : 13-mrt-2018, 12:54:32
    Author     : c1042421
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="hbo5.it.www.beans.SoortBroek"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bestel hier je broeken</h1>
        <form action="ManageServlet">
            <p><label>Datum: </label> <input name="datum" type="date" value="<%= LocalDate.now() %>"/> </p>
            <p><label>Naam:</label> <input name="naam" type="text"/> </p>
            <p><label>Welk soort broek wens je te bestellen: </label>
            <select name="soort">
                <% for(SoortBroek soort : SoortBroek.values()) { %>
                    <option value="<%= soort %>"><%= soort %></option>
                <%}%>
            </select></p>
            <p><label>Aantal: </label> <input name="aantal" type="text"/></p> 
            <p> <input type="submit" value="bevestig"/>
        </form>
    </body>
</html>
