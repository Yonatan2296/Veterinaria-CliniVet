


<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page session="true" %>

<%@page import="Modelo.Cita"%>
<%@page import="java.lang.String"%>
<%@page import="Modelo.CitaDAO"%>

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





            <%        CitaDAO dao = new CitaDAO();

                int id = Integer.parseInt((String) request.getAttribute("idper"));

                Cita p = dao.enviar(id);


            %>








            <!-- formularioss -->







            <form action="ControladorCita">

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
                                            <input type="text" class="form-control"  placeholder="Ingrese Codigo"   name="txtcodigo" value="<%= p.getCodmascota()%>">
                                        </div>


                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Mascota</label>
                                            <input type="text" class="form-control"  placeholder="Ingrese Nombre"  name="txtnombres"  value="<%= p.getMascota()%>">
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
                                                <label for="exampleInputEmail1">Hora</label>
                                                <input type="time" REQUIRED name="txthora"  class="form-control"  placeholder="">
                                            </div>






                                            <div class="form-group">
                                                <label>Estado</label>
                                                <select  id="cboestado" name="cboestado"  class="form-control" style="width: 100%;">

                                                    <option value="Pendiente">Pendiente</option>
                                                    <option value="Atendido">Atendido</option>



                                                </select>
                                            </div>






                                            <div class="form-group">
                                                <label for="exampleInputEmail1">Fecha</label>
                                                <input type="date" REQUIRED name="txtfecha"  class="form-control">




                                            </div>





                                        </div>
                                        <!-- /.form-group -->
                                    </div>
                                    <!-- /.col -->
                                </div>
                                <!-- /.row -->
                            </div>

                            <div class="box-footer">

                                <input class="btn btn-success"  type="submit" name="accion"   value="Guardar"> 


                                <A HREF="agregar_tratamiento.jsp"  class="btn btn-warning">Listado</A>  </button>




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
