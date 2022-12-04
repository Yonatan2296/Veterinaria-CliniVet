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
            <div class="content-wrapper">
                <section class="content-header">

                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title"><center>Listado de Clientes su Mascotas  </h3></center>

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
                                                <td colspan="3"><b>Accion</b>
                                            </tr>

                                            <%                                                MascotaDAO dao = new MascotaDAO();

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
                                                    <a class="btn btn-warning" href="ControladorCita?accion=editar&id=<%=per.getIdmascota()%>">Seleccionar</a>
                                                </td> 
                                            </tr>
                                            <%}%>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                </section>

            </div>
        </div>
        <%@include file="includes/RecursoJs.jsp" %>
    </body>
</html>
