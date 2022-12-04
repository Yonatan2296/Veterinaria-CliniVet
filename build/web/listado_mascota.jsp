<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Mascota"%>
<%@page import="Modelo.MascotaDAO"%>




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
                                    <h3 class="box-title"><center>Listado de Mascota </h3></center>
                                    <!--
                                                                            <div class="box-tools">
                                                                                <div class="input-group input-group-sm" style="width: 200px;">
                                        <form action="ControladorMascota">
                                                                                    <input type="text" name ="txtbuscar"  class="form-control pull-right" placeholder="Ingrese Mascota" id="busqueda">
                                    
                                                                                    <div class="input-group-btn">
                                    
                                    
                                                                                        <input class="btn btn-success"  type="submit" name="accion"   value="Buscar">  
                                    
                                                                                   
                                    
                                    
                                                                                        <div class="input-group-btn">
                                    
                                    
                                    
                                    
                                                                                        </div>
                                                                                    </div>
                                                                                            </form>
                                                                                </div>
                                    -->
                                </div>
                                <!-- /.box-header -->
                                <div class="box-body table-responsive no-padding">

                                    <br><br>
                                    <table class="table table-hover">
                                        <tr>

                                            <td><b>Codigo</b></td>          
                                            <td><b>Mascota</b></td>
                                            <td><b>Especie</b></td>        


                                            <td><b>Raza</b></td> 

                                            <td><b>Fecha Nacimiento</b></td> 

                                            <td><b>Peso</b></td>        


                                            <td><b>Sexo</b></td> 

                                            <td><b>Cliente</b></td>    


                                            <td colspan="3"><b>Seleccionar</b>



                                        </tr>



                                        <%                                                    MascotaDAO dao = new MascotaDAO();

                                            List<Mascota> list = dao.listar();

                                            Iterator<Mascota> iter = list.iterator();

                                            Mascota per = null;

                                            while (iter.hasNext()) {

                                                per = iter.next();


                                        %>







                                        <tr>
                                            <td class="text-center"><%= per.getIdmascota()%></td>

                                            <td><%= per.getNombre()%></td>
                                            <td><%= per.getEspecie()%></td>
                                            <td><%= per.getCodraza()%></td>

                                            <td><%= per.getFecha()%></td>
                                            <td><%= per.getPeso()%></td>

                                            <td><%= per.getSexo()%></td>
                                            <td><%= per.getCodcliente()%></td>

                                            <td>



                                                <a class="btn btn-warning" href="ControladorMascota?accion=editar&id=<%=per.getIdmascota()%>">Editar</a>
                                                <%
                                                    if (request.getSession().getAttribute("rol").equals("Administrador")) {
                                                %>
                                                <a class="btn btn-danger" href="ControladorMascota?accion=eliminar&id=<%=per.getIdmascota()%>">Eliminar</a>

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


            </div>
           <%@include file="includes/RecursoJs.jsp" %>
    </body>
</html>
