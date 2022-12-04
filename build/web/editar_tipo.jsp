


<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>



<%@page import="Modelo.Tipo_Tratamiento"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>






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










            <form action="ControladorTipo_Tratamiento">



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
                                            <label for="exampleInputEmail1">Nombre</label>
                                            <input type="text"   class="form-control"  placeholder="Ingrese Nombre" name="txtnombre">
                                        </div>



                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Precio</label>
                                            <input type="text"   class="form-control"  placeholder="Ingrese Precio" name="txtprecio">
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
                                                <label>Veterinario</label>



                                                <jsp:useBean id="cn" class="Modelo.Tipo_TratamientoDAO"> </jsp:useBean>

                                                <%
                                                    ResultSet rs = cn.mostrarveterinario();
                                                %>
                                                <select class="form-control" id="cboveterinario" name="cboveterinario" autofocus=""  required="">


                                                    <%
                                                        while (rs.next()) {

                                                    %>
                                                    <option value="<%=rs.getString("cod_veterinario")%>"><%=rs.getString("nombres")%> </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>






                                            </div>

                                            <div class="form-group">

                                                <!-- dividir ventana -->







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


                                <a href="ControladorTipo_Tratamiento?accion=listar" class="btn btn-primary" >Listado</a>


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
