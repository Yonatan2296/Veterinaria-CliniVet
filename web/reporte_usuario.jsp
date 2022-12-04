<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Historial"%>
<%@page import="Modelo.HistorialConsultaDAO"%>




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



            <form name="reporte" action="ControladorUsuariosReporte">

                <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                    <section class="content-header">
                        <!-- /.row -->
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="box">
                                    <div class="box-header">

                                        <br>   <br>   <br>   <br>   <br>   <br>   <br>   <br>   <br>   <br>   <br>
                                        <center>
                                            <h3 class="box-title"><input type="submit" name="button" class="btn btn-success" id="button" value="Reporte de Usuarios"> </h3></center>

                                        <div class="box-tools">
                                            <div class="input-group input-group-sm" style="width: 200px;">




                                                <div class="input-group-btn">




                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.box-header -->
                                    <div class="box-body table-responsive no-padding">

                                        <br><br>
                                        <table class="table table-hover">
                                            <tr>



                                        </table>
                                        </form>
                                        <!-- /.box-body -->
                                        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> 
                                    </div>
                                    <!-- /.box-body -->
                                </div>
                                <!-- /.box -->
                            </div>
                        </div>
                    </section>


                </div><%@include file="includes/RecursoJs.jsp" %>
                </body>
                </html>
