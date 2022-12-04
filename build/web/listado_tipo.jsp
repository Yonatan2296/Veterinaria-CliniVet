<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Tipo_Tratamiento"%>
<%@page import="Modelo.Tipo_TratamientoDAO"%>




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
                    <!-- Content Header (Page header) -->
                    <section class="content-header">
                        <!-- /.row -->
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="box">
                                    <div class="box-header">
                                        <h3 class="box-title"><center>Listado de Tipo Tratamiento </h3></center>

                                        <!-- /.box-header -->
                                        <div class="box-body table-responsive no-padding">

                                            <br><br>
                                            <table class="table table-hover">
                                                <tr>

                                                    <td><b>Codigo</b></td>          
                                                    <td><b>Nombre</b></td>
                                                    <td><b>Precio</b></td>        


                                                    <td><b>Veterinario</b></td> 







                                                    <td colspan="3"><b>Seleccionar</b>



                                                </tr>



                                                <%

                                                    Tipo_TratamientoDAO dao = new Tipo_TratamientoDAO();

                                                    List<Tipo_Tratamiento> list = dao.listar();

                                                    Iterator<Tipo_Tratamiento> iter = list.iterator();

                                                    Tipo_Tratamiento per = null;

                                                    while (iter.hasNext()) {

                                                        per = iter.next();


                                                %>







                                                <tr>
                                                    <td class="text-center"><%= per.getId()%></td>

                                                    <td><%= per.getNombre()%></td>
                                                    <td><%= per.getPrecio()%></td>
                                                    <td><%= per.getCodveterinario()%></td>


                                                    <td>






                                                        <a class="btn btn-danger" href="ControladorTipo_Tratamiento?accion=eliminar&id=<%=per.getId()%>">Cancelar</a>


                                                    </td> 
                                                </tr>
                                                <%}%>
                                                </tbody>

                                            </table>

                                            <!-- /.box-body -->
                                            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> 
                                        </div>
                                        <!-- /.box-body -->
                                    </div>
                                    <!-- /.box -->
                                </div>
                            </div>
                    </section>
                    <!-- /.content -->


                </div>
              <%@include file="includes/RecursoJs.jsp" %>
                </body>
                </html>
