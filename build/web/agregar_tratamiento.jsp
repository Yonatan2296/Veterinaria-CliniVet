<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Historial"%>
<%@page import="Modelo.HistorialDAO"%>




<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title></title>
  <%@include file="includes/RecursoCss.jsp" %> </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

           <%@include file="includes/Header.jsp" %>
            <%@include file="includes/Navegacion.jsp" %>



            <!-- formularioss -->






            <form action="ControladorHistorial">

                <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                    <section class="content-header">
                        <!-- /.row -->
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="box">
                                    <div class="box-header">
                                        <h3 class="box-title"><center>Listado de Clientes su Mascota  </h3></center>

                                     <!--
                                        <div class="box-tools">
                                            <div class="input-group input-group-sm" style="width: 200px;">

                                                <input type="text" name ="txtbuscar"  class="form-control pull-right" placeholder="Ingrese Cliente" id="busqueda">

                                                <div class="input-group-btn">


                                                    <input class="btn btn-success"  type="submit" name="accion"   value="Buscar">  

                                                    </form>


                                                    <div class="input-group-btn">




                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                     -->
                                        <!-- /.box-header -->
                                        <div class="box-body table-responsive no-padding">

                                            <br><br>
                                            <table class="table table-hover">
                                                <tr>

                                                    <td><b>Codigo</b></td>          
                                                    <td><b>Mascota</b></td>
                                                    <td><b>Especie</b></td>        


                                                    <td><b>Fecha</b></td> 

                                                    <td><b>Hora</b></td> 

                                                    <td><b>Estado</b></td>        

                                                    <td><b>Cliente</b></td>  



                                                    <td colspan="3"><b>Seleccionar</b>



                                                </tr>



                                                <%     HistorialDAO dao = new HistorialDAO();

                                                    List<Historial> list = dao.listar();

                                                    Iterator<Historial> iter = list.iterator();

                                                    Historial per = null;

                                                    while (iter.hasNext()) {

                                                        per = iter.next();


                                                %>







                                                <tr>
                                                    <td class="text-center"><%= per.getCodmascota()%></td>

                                                    <td><%= per.getMascota()%></td>

                                                    <td><%= per.getEspecie()%></td>

                                                    <td><%= per.getFecha()%></td>
                                                    <td><%= per.getHora()%></td>

                                                    <td><%= per.getEstado()%></td>

                                                    <td><%= per.getCliente()%></td>

                                                    <td>
     <a class="btn btn-warning" href="ControladorHistorial?accion=editar&id=<%=per.getCodmascota()  %>">Enviar</a>
    
    
     <a class="btn btn-danger" href="ControladorCita?accion=eliminar&id=<%=per.getCodmascota()  %>">Cancelar</a>
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
