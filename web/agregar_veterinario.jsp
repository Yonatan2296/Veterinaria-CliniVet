


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










            <form action="ControladorVeterinario">



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
                                            <label for="exampleInputEmail1">N° Dni</label>
                                            <input type="text"   class="form-control"  placeholder="Ingrese N° Dni" name="txtdni">
                                        </div>



                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Veterinario</label>
                                            <input type="text"   class="form-control"  placeholder="Ingrese Nombres" name="txtnombres">
                                        </div>


                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Especialidad</label>
                                            <input type="text"  class="form-control"  placeholder="Ingrese Especialidad"  name="txtespecialidad">
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
                                                <label for="exampleInputEmail1">Direccion </label>
                                                <input type="text"  class="form-control"  placeholder="Ingrese Direccion"  name="txtdireccion">
                                            </div>

                                            <div class="form-group">

                                                <!-- dividir ventana -->


                                                <div class="form-group">
                                                    <label for="exampleInputEmail1">Telefono</label>
                                                    <input type="text"   class="form-control"  placeholder="Ingrese Telefono" name="txttelefono">
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




                                <input class="btn btn-success"  type="submit" name="accion"   value="Guardar"> 


                                <a href="ControladorVeterinario?accion=listar" class="btn btn-primary" >Listado</a>


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

<%@include file="includes/RecursoJs.jsp" %>
</body>
</html>
