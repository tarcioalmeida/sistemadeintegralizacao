<%-- 
    Document   : SemestreCancelado
    Created on : 25/05/2017, 09:43:45
    Author     : apmagalhaes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="ContrSemestre">
        <h1>Semestres cancelados</h1>
        <p>Ano:<input type="text" name="ano"></p>
        <p>Semestre:<input type="text" name="semestre"></p>
        <input type="hidden" name="logica" value="salvar">
        <p><input type="submit" value="Salvar"</p>
        </form>
    </body>
</html>
