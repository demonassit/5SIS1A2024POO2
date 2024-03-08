<%-- 
    Document   : registro
    Created on : 4/03/2024, 09:44:52 AM
    Author     : demon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form name="formulario" 
                  action="guardarAlumno"
                  method="post"    >
                <label>Nombre: </label>
                <br>
                <input type="text" 
                       name="nombre" >
                <br>
                <label>Apellido Paterno: </label>
                <br>
                <input type="text" 
                       name="appat" >
                <br>
                <label>Apellido materno: </label>
                <br>
                <input type="text" 
                       name="apmat" >
                <br>
                <label>Edad: </label>
                <br>
                <input type="text" 
                       name="edad" >
                <br>
                <input type="submit" name="enviar"
                       value="Registrar Alumno">
                <input type="reset" name="borrar"
                       value="Borrar Datos">
            </form>
    </body>
</html>
