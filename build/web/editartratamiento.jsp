

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Mascota"%>
<%@page import="Modelo.MascotaDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>



<%@page import="Modelo.Historial"%>

<%@page import="Modelo.HistorialDAO"%>
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

            <%                HistorialDAO dao = new HistorialDAO();

                int id = Integer.parseInt((String) request.getAttribute("idper"));

                Historial p = dao.enviar(id);


            %>

            <form action="Controlador_Consulta_Tratamiento">

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
                                            <label for="exampleInputEmail1">Nª Mascota</label>
                                            <select class="form-control" name="txtcodigoMasc" required="">
                                                <option>:::Seleccione:::</option>
                                                <%                                                 MascotaDAO masDao = new MascotaDAO();
                                                    ArrayList<Mascota> listaMasc = (ArrayList<Mascota>) masDao.listar();
                                                    for (Mascota m : listaMasc) {

                                                        if (m.getIdmascota() == Integer.parseInt(p.getCodmascota())) {
                                                %>
                                                <option value="<%=m.getIdmascota()%>" selected=""><%=m.getNombre()%></option>
                                                <%

                                                } else {
                                                %>
                                                <option value="<%=m.getIdmascota()%>"><%=m.getNombre()%></option>
                                                <%
                                                    }
                                                %>

                                                <%
                                                %>

                                                <%                                                    }
                                                %>
                                            </select>
                                        </div>


                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Diagnostico</label>
                                            <input type="text"   class="form-control"  placeholder="Ingrese Diagnostico" name="txtdiagnostico">
                                        </div>



                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Receta</label>
                                            <input type="text"   class="form-control"  placeholder="Ingrese Receta" name="txtreceta">
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
                                                <label>Tipo Tratamiento</label>



                                                <jsp:useBean id="cnn" class="Modelo.HistorialDAO"> </jsp:useBean>

                                                <%
                                                    ResultSet rss = cnn.mostrartipo_tratamiento();
                                                %>
                                                <select class="form-control" id="cbotipo" name="cbotipo" autofocus=""  required="">

                                                    <option>:::Seleccione:::</option>
                                                    <%
                                                        while (rss.next()) {

                                                    %>
                                                    <option value="<%=rss.getString("cod_tratamiento")%>"><%=rss.getString("nombre")%> </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>

                                            </div>


                                            <div class="form-group">
                                                <label for="exampleInputEmail1">Fecha</label>
                                                <input type="date" REQUIRED name="txtfecha"  class="form-control">
                                            </div>



                                            <div class="form-group">
                                                <label>Usuario</label>
                                                <jsp:useBean id="cn" class="Modelo.HistorialDAO"> </jsp:useBean>

                                                <%
                                                    ResultSet rs = cn.mostrarusuario();
                                                %>
                                                <select class="form-control" id="cbousuario" name="cbousuario" autofocus=""  required="">
                                                    <%
                                                        while (rs.next()) {

                                                    %>
                                                    <option value="<%=rs.getString("codigo")%>"><%=rs.getString("usuario")%> </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>

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

                                <a href="Controlador_Consulta_Tratamiento?accion=listar" class="btn btn-primary" >Listado</a>
                            </div>



                        </div>
                    </div>
                    <!-- /.box -->
                </div>
            </form>

            <!-- /.col (right) -->
        </div>
        <!-- /.row -->

    </section>
    <!-- /.content -->
</div>


</div><%@include file="includes/RecursoJs.jsp" %>
</body>
</html>
