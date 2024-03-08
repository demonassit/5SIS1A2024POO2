<%-- 
    Document   : editaralumno
    Created on : 5/03/2024, 08:24:58 AM
    Author     : demon
--%>

<%@page import="Modelo.Alumno"%>
<%@page import="Controlador.AccionesAlumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Datos</title>
    </head>
    <body>
        <div class="container" >
            <form method="post" name="editar" action="actualizarAlumno" >
                <table border="2" >
                    <%
                        //es obtener el id del alumno que deseo editar sus datos
                        int id = Integer.parseInt(request.getParameter("id"));
                        System.out.println(id);
                        
                        //necesito hacer una busqueda del dato
                        Alumno alu = AccionesAlumno.buscarAlumnoById(id);
                        %>
                        <tr>
                            <td>ID</td>
                            <td> <input type="hidden" name="id2" 
                                        value="<%=alu.getIdAlumno()%>" > </td>
                        </tr>
                        <tr>
                            <td>Nombre</td>
                            <td> <input type="text" name="nombre2" 
                                        value="<%=alu.getNom_alu()%>" > </td>
                        </tr>
                        <tr>
                            <td>Apellido Paterno</td>
                            <td> <input type="text" name="appat2" 
                                        value="<%=alu.getAppat_alu()%>" > </td>
                        </tr>
                        <tr>
                            <td>Apellido Materno</td>
                            <td> <input type="text" name="apmat2" 
                                        value="<%=alu.getApmat_alu()%>" > </td>
                        </tr>
                        <tr>
                            <td>Edad</td>
                            <td> <input type="text" name="edad2" 
                                        value="<%=alu.getEdad_alu()%>" > </td>
                        </tr>
                        <tr>
                            <td colspan="2" > <input type="submit" 
                                                     value="Actualizar Datos" > </td>
                        </tr>
                </table>
            </form>
        </div>
    </body>
</html>
