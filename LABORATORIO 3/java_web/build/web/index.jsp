<%-- 
    Document   : index
    Created on : 27 abr 2024, 11:25:15 p. m.
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
        <h1>Solicitud</h1>
        <h3>Despues de llengar la solicitud presione el boton de "ENVIAR"</h3>
        <form action="result.jsp" method="post">
            
            
            <br>
            
            <table border="1" cellspacing="3" cellpadding="3">
                <thead>
                    <tr>
                        <th>Nombre:</th>
                        <td>
                            <input type="text" name="name">
                        </td>
                    </tr>
                </thead>
                <thead>
                    <tr>
                        <th>Apellido:</th>
                        <td>
                            <input type="text" name="apellido">
                        </td>
                    </tr>
                </thead>
                <thead>
                    <tr>
                        <th>Correo:</th>
                        <td>
                            <input type="text" name="correo">
                        </td>
                    </tr>
                </thead>
            </table>

            <br>
            
            
            <label>Eres: </label>
            <input type="radio" name="genero" value="hombre">Hombre
            <input type="radio" name="genero" value="mujer">Mujer<br>
            
            <br>
            
            <label>Selecciona los lenguajes en los que programa</label><br><br>
            <input type="checkbox" name="java" value="Java">Java
            <input type="checkbox" name="c" value="C/C++">C/C++
            <input type="checkbox" name="php" value="PHP">PHP
            
            <br><br>
            
            <label>Lenguajes que comprendes</label><br><br>
            <select id="id" name="idiomas" multiple>
                <option value="español">Español</option>
                <option value="ingles">Ingles</option>
                <option value="frances">Frances</option>
                <option value="aleman">Aleman</option>
            </select>
            <br>
            
            <label>enviar comentarios</label>
            <br>
            <textarea id="id" name="comentario" rows="5" cols="50"></textarea>
            <br>
            
            <input type="submit" value="Enviar datos">
        </form>
    </body>
</html>
