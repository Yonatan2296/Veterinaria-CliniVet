

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page session="true" %>

<%@page import="Modelo.Cliente"%>
<%@page import="java.lang.String"%>
<%@page import="Modelo.ClienteDAO"%>

<%
    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("cargo") == null) {

        response.sendRedirect("Login.jsp");

    } else {

        String cargo = sesion.getAttribute("cargo").toString();

        if (!cargo.equals("1") && !cargo.equals("2")) {

            response.sendRedirect("Login.jsp");

        }

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

            <!-- formularioss -->




            <%        ClienteDAO dao = new ClienteDAO();

                int id = Integer.parseInt((String) request.getAttribute("idper"));

                Cliente p = dao.enviar(id);


            %>







            <form action="ControladorCliente">



                <div class="content-wrapper">




                    <!-- SELECT2 EXAMPLE -->
                    <div class="box box-default">
                        <div class="box-header with-border">
                            <h3 class="box-title"></h3>


                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">

                                        <!-- dividir ventana -->




                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Codigo</label>
                                            <input type="text" class="form-control"  placeholder="Ingrese Codigo"   name="txtcodigo" value="<%= p.getId()%>">
                                        </div>

                                        <div class="form-group">
                                            <label for="exampleInputEmail1">N° Dni</label>
                                            <input type="text" class="form-control"  placeholder="Ingrese N° Cedula/Dni"   name="txtdni" value="<%= p.getDni()%>">
                                        </div>



                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Cliente</label>
                                            <input type="text" class="form-control"  placeholder="Ingrese Nombre"  name="txtnombres"  value="<%= p.getNom()%>">
                                        </div>








                                    </div>
                                    <!-- /.form-group -->
                                </div>






                                <!-- /.col -->
                                <div class="col-md-6">


                                    <!-- /.form-group -->
                                    <div class="form-group">
                                        <div class="form-group">

                                            <!-- dividir ventana -->




                                            <div class="form-group">
                                                <label for="exampleInputEmail1">Direccion</label>
                                                <input type="text" class="form-control"  placeholder="Ingrese Email"  name="txtdireccion"  value="<%= p.getDireccion()%>">
                                            </div>

                                            <div class="form-group">
                                                <label for="exampleInputEmail1">Email</label>
                                                <input type="text" class="form-control"  placeholder="Ingrese Email"  name="txtemail"  value="<%= p.getEmail()%>">
                                            </div>




                                            <div class="form-group">

                                                <!-- dividir ventana -->

                                                <div class="form-group">
                                                    <label for="exampleInputEmail1">Telefono </label>
                                                    <input type="text" class="form-control"  placeholder="Ingrese Telefono"  name="txttelefono" value="<%= p.getTel()%>">
                                                </div>





                                                <!-- /.form group -->


                                            </div>




                                        </div>
                                        <!-- /.form-group -->
                                    </div>
                                    <!-- /.col -->
                                </div>
                                <!-- /.row -->
                            </div>

                            <div class="box-footer">





                                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 



                                <a href="ControladorCliente?accion=listar" class="btn btn-warning" >Listado</a>


                            </div>
                            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>








                            <!-- /.box-body -->

                            <!-- /.box -->




                        </div>
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col (right) -->
        </div>
        <!-- /.row -->

    </section>
    <!-- /.content -->
</div>

</form>

</div><%@include file="includes/RecursoJs.jsp" %>
</body>
</html>





