
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.UsuarioDAO"%>



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



            <script src="sweetalert2/jquery.min.js"></script>

            <script src="sweetalert2/sweetalert2.all.min.js"></script>

            <script>

                function registro_eliminar_confirmar(codigo) {

                    Swal.fire({
                        icon: 'warning',
                        title: '¿Estás seguro de eliminar  este Registro?',
                        showConfirmButton: true,
                        confirmButtonText: 'ELIMINAR',
                        confirmButtonColor: '#3085d6',
                        showCancelButton: true,
                        cancelButtonText: 'CANCELAR',
                        cancelButtonColor: '#d33',
                        buttonsStyling: true,

                    }).then((result) => {
                        if (result.isConfirmed) {
                            $.ajax({
                                type: 'POST',
                                url: 'ControladorUsuario?accion=eliminar&id',

                                data: {codigo: codigo},

                                success: function (data) {
                                    Swal.fire({

                                        icon: 'success',
                                        title: 'Registro eliminado correctamente',
                                        showConfirmButton: true,
                                        //       setTimeout(function()){

                                        //      parent.location.href="listado_curso.php";
                                        // }


                                        timer: 1500,

                                    })
                                }
                            });
                        }

                    })
                }

            </script>






            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title"><center>Listado de Usuarios  </h3></center>

                                    <div class="box-tools">
                                        <div class="input-group input-group-sm" style="width: 200px;">
                                            <!--
                                            <form action="ControladorUsuario">
                                            
                                            
                                                                                            <input type="text" name ="txtbuscar"  class="form-control pull-right" placeholder="Ingrese Usuario" id="busqueda">
                                            
                                                                                            <div class="input-group-btn">
                                            
                                            
                                                                                                <input class="btn btn-success"  type="submit" name="accion"   value="Buscar">  
                                            
                                                                                         
                                            
                                                                                                <div class="input-group-btn">
                                            
                                            
                                            
                                            
                                                                                                </div>
                                                                                            </div>
                                                                                                   </form>
                                            -->
                                        </div>
                                    </div>
                                    <!-- /.box-header -->
                                    <div class="box-body table-responsive no-padding">

                                        <br><br>
                                        <table class="table table-hover">
                                            <tr>

                                                <td><b>Codigo</b></td>         
                                                <td><b>Usuario</b></td>


                                                <td><b>Contraseña</b></td> 

                                                <td><b>N° Cargo</b></td> 







                                                <td colspan="3"><b>Seleccionar</b>



                                            </tr>



                                            <%

                                                UsuarioDAO dao = new UsuarioDAO();

                                                List<Usuario> list = dao.listar();

                                                Iterator<Usuario> iter = list.iterator();

                                                Usuario per = null;

                                                while (iter.hasNext()) {

                                                    per = iter.next();


                                            %>







                                            <tr>
                                                <td class="text-center"><%= per.getId()%></td>

                                                <td><%= per.getUsuario()%></td>
                                                <td><%= per.getContra()%></td>


                                                <td><%= per.getCargo()%></td>


                                                <td>

                                                    <a class="btn btn-warning" href="ControladorUsuario?accion=editar&id=<%=per.getId()%>">Editar</a>

                                                    <a class="btn btn-danger" href="ControladorUsuario?accion=eliminar&id=<%=per.getId()%>">Eliminar</a>


<!-- /<a href="" data-toggle="modal" class="btn btn-danger"  onclick="registro_eliminar_confirmar(<%=per.getId()%>)">Eliminar</a>-->



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

            </div>
            <%@include file="includes/RecursoJs.jsp" %>
    </body>
</html>
