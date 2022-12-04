<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<%
    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("cargo") == null) {

        response.sendRedirect("Login.jsp");

    } else {

        String cargo = sesion.getAttribute("cargo").toString();

        if (!cargo.equals("2")) {

            response.sendRedirect("Login.jsp");

        }
        String nomCargo = RolConfig.NomRol(cargo);
        request.getSession().setAttribute("rol", nomCargo);
    }


%>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title></title>
        <%@include file="includes/RecursoCss.jsp" %>
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

            <%@include file="includes/Header.jsp" %>
            <%@include file="includes/Navegacion.jsp" %>

            <div class="box box-info">
                <div class="box-header">
                    <Center>       
                        <img src="imagenes/fo.jpg" alt="">
                        <h3><b>Sistema de Veterinaria CliniVet</b></h3>

                    </Center> 
 
                </div>

            </div>
        </div>

        <%@include file="includes/RecursoJs.jsp" %>
    </body>
</html>





