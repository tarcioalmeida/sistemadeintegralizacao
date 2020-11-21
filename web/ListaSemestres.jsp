<%-- 
    Document   : ListaSemestres
    Created on : 25/05/2017, 10:30:58
    Author     : apmagalhaes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Semestres cancelados</title>
    </head>
    <body>
        <form action = "ContrSemestre" method="post">
            
            <% Model.SemestreCancelado sc = (Model.SemestreCancelado)request.getAttribute("sc");%>
            <table border = "1">
                <% for (int i=0;i<sc.getTodos().length;i++)
                    if (sc.getTodos()[i]!=null){%>
                <tr>
                    <td><%=sc.getTodos()[i].getAno()%></td>
                    <td><%=sc.getTodos()[i].getSemestre()%></td>
                    <td><a href="ContrSemestre?logica=alterar&id=<%=sc.getTodos()[i].getId()%>">alterar</a></td>
                    <td><a href="ContrSemestre?logica=excluir&id=<%=sc.getTodos()[i].getId()%>">excluir</a></td>
                </tr>
                <%}%>
            </table>
            <input type="hidden" name="logica" value="incluir">
            <p><input type="submit" value="Novo"</p>
        </form>
    </body>
</html>
