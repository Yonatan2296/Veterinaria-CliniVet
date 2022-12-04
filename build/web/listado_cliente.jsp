<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="Modelo.ClienteDAO"%>




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








            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title"><center>Listado de Clientes  </h3></center>

                                    <!--
                                     <div class="box-tools">
                                         <div class="input-group input-group-sm" style="width: 200px;">
                                             <form action="ControladorCliente">
                                                 <input type="text" name ="txtbuscar"  class="form-control pull-right" placeholder="Ingrese Cliente" id="busqueda">
 
                                                 <div class="input-group-btn">
 
 
                                                     <input class="btn btn-success"  type="submit" name="accion"   value="Buscar">  
 
 
 
 
                                                     <div class="input-group-btn">
 
 
 
 
                                                     </div>
                                                 </div>
                                             </form>
                                         </div>
                                     </div>
                                    -->
                                    <!-- /.box-header -->
                                    <div class="box-body table-responsive no-padding">

                                        <br><br>
                                        <table class="table table-hover">
                                            <tr>

                                                <td><b>Codigo</b></td>          
                                                <td><b>Cliente</b></td>
                                                <td><b>Dni</b></td>        


                                                <td><b>Direccion</b></td> 

                                                <td><b>Telefono</b></td> 

                                                <td><b>Email</b></td>        





                                                <td ><b>Seleccionar</b>



                                            </tr>



                                            <%                                                ClienteDAO dao = new ClienteDAO();

                                                List<Cliente> list = dao.listar();

                                                Iterator<Cliente> iter = list.iterator();

                                                Cliente per = null;

                                                while (iter.hasNext()) {

                                                    per = iter.next();


                                            %>







                                            <tr>
                                                <td class="text-center"><%= per.getId()%></td>

                                                <td><%= per.getNom()%></td>
                                                <td><%= per.getDni()%></td>
                                                <td><%= per.getDireccion()%></td>

                                                <td><%= per.getTel()%></td>
                                                <td><%= per.getEmail()%></td>

                                                <td>

                                                    <a class="btn btn-warning" href="ControladorCliente?accion=editar&id=<%=per.getId()%>">Editar</a>

                                                    <%
                                                        if (request.getSession().getAttribute("rol").equals("Administrador")) {
                                                    %>
                                                    <a class="btn btn-danger" href="ControladorCliente?accion=eliminar&id=<%=per.getId()%>">Eliminar</a>

                                                    <%
                                                        }
                                                    %>


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
