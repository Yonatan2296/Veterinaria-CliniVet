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






            <form action="Controlador_Consulta_Tratamiento">

                <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                    <section class="content-header">
                        <!-- /.row -->
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="box">
                                    <div class="box-header">
                                        <h3 class="box-title"><center>Listado de Historial de Mascotas </h3></center>

                                        <!-- /.box-header -->
                                        <div class="box-body table-responsive no-padding">

                                            <br><br>
                                            <table class="table table-hover">
                                                <tr>

                                                    <td><b>Codigo</b></td>          
                                                    <td><b>Mascota</b></td>
                                                    <td><b>Especie</b></td>        


                                                    <td><b>Diagnostico</b></td> 

                                                    <td><b>Tratamiento</b></td> 

                                                    <td><b>Receta</b></td>        
                                                    <td><b>Fecha</b></td>   
                                                    <td><b>Cliente</b></td>   



                                                    <td colspan="2"><b>Seleccionar</b>



                                                </tr>



                                                <%                                                    HistorialConsultaDAO dao = new HistorialConsultaDAO();

                                                    List<Historial> list = dao.listar();

                                                    Iterator<Historial> iter = list.iterator();

                                                    Historial per = null;

                                                    while (iter.hasNext()) {

                                                        per = iter.next();


                                                %>







                                                <tr>
                                                    <td class="text-center"><%= per.getId()%></td>


                                                    <td><%= per.getNombremascota()%></td>
                                                    <td><%= per.getEspecie()%></td>

                                                    <td><%= per.getDiagnostico()%></td>
                                                    <td><%= per.getCodtratamiento()%></td>

                                                    <td><%= per.getReceta()%></td>
                                                    <td><%= per.getFecha()%></td>
                                                    <td><%= per.getCliente()%></td>
                                                    <td>
                                                        <a class="btn btn-warning" href="editar_tratamiento.jsp?id=<%=per.getId()%>">Editar</a>
                                                    </td>
                                                    <td>

                                                        <a class="btn btn-danger" href="Controlador_Consulta_Tratamiento?accion=eliminar&id=<%=per.getId()%>">Cancelar</a>

                                                    </td> 

                                                </tr>
                                                <%}%>
                                                </tbody>

                                            </table>
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
