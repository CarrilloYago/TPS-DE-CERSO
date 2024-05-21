<%-- 
    Document   : result
    Created on : 27 abr 2024, 11:27:42 p. m.
    Author     : yagoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Solicitud completada:</h1>
        <h3>Tus datos son: </h3>
        <%
            String nombre = request.getParameter("name");
            String apellido = request.getParameter("apellido");
            String correo = request.getParameter("correo");
            
            String java = request.getParameter("java");
            String c = request.getParameter("c");
            String php = request.getParameter("php");
            
            String idiomas[]=request.getParameterValues("idiomas");
            String comentario = request.getParameter("comentario");
            String genero = request.getParameter("genero");
        %>
        
        
            <table border="1" cellspacing="3" cellpadding="3">
                <thead>
                    <tr>
                        <th>Te llamas:</th>
                        <td>
                            <% if (nombre != null){%>  
                                <%= nombre%>   
                            <% } %>
                        </td>
                    </tr>
                </thead>
                <thead>
                    <tr>
                        <th>Tu Apellido:</th>
                        <td>
                            <% if (apellido != null){%>  
                                <%= apellido%>     
                            <% } %>
                        </td>
                    </tr>
                </thead>
                <thead>
                    <tr>
                        <th>Tu Correo:</th>
                        <td>
                            <% if (correo != null){%>  
                                <%= correo%>    
                            <% } %>
                        </td>
                    </tr>
                </thead>
                <thead>
                    <tr>
                        <th>Sos:</th>
                        <td>
                            <% if (genero != null){%>  
                                <%= genero%>     
                            <% } %>
                        </td>
                    </tr>
                </thead>
            </table>

        <br>
        
        <p> Manejas los siguientes lenguajes de programacion: </p>
        
        
        <% if (java != null){%>  
        <%= java%>    
        <% } %>
        
        <% if (c != null){%>  
        <%= c%>
        <% } %>
        
        <% if (php != null){%>  
        <%= php%>
        <% } %>
        
        <p>Los idomas que comprendes son:</p>
                <% for (int i = 0; i <idiomas.length; i++) { %>
                <%=idiomas[i]%> 
                <%}%>
        
        <p>tus comentarios: <%=comentario%> </p>
        <form action="index.jsp">
            <input type="submit" value="Regresar al inicio de la solicitud">
        </form>
    </body>
</html>
