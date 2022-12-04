<%@page import="Config.RolConfig"%>

<%
    String nomCargo = "";

    if (request.getSession().getAttribute("rol") != null) {
        nomCargo = request.getSession().getAttribute("rol").toString();
    }

%>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="imagenes/admin.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><%=nomCargo%></p>
                <a href="#"><i class="fa fa-circle text-success"></i> Conectado</a>
            </div>

        </div>
        <!-- search form -->

        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu" data-widget="tree">


            </span>
            </a>

            </li>

            </a>
            <ul class="treeview-menu">
                <li><a href="pages/layout/top-nav.html"><i class="fa fa-circle-o"></i> </a></li>
                <li><a href="pages/layout/boxed.html"><i class="fa fa-circle-o"></i> </a></li>
                <li><a href="pages/layout/fixed.html"><i class="fa fa-circle-o"></i> </a></li>
                <li><a href="pages/layout/collapsed-sidebar.html"><i class="fa fa-circle-o"></i> </a></li>
            </ul>
            </li>
            <li>


                </a>
            </li>
            <li class="treeview">
                <a href="#">
                    <i class=""></i>



            </li>
          <%
          
          if (nomCargo.equals("Administrador")) {
              %>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-laptop"></i>
                    <span>Veterinario</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="agregar_veterinario.jsp"><i class="fa fa-circle-o"></i> Registrar Veterinario</a></li>


                </ul>
            </li>
            <%
          }
          %>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-laptop"></i>
                    <span>Cliente</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="agregar_cliente.jsp"><i class="fa fa-circle-o"></i> Registrar Cliente</a></li>


                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-laptop"></i>
                    <span>Mascota</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="agregar_mascota.jsp"><i class="fa fa-circle-o"></i> Registrar Mascota</a></li>


                </ul>
            </li>


            <li class="treeview">

                </a>
                <ul class="treeview-menu">


                    <li><a href="pages/examples/404.html"><i class="fa fa-circle-o"></i> </a></li>
                    <li><a href="pages/examples/500.html"><i class="fa fa-circle-o"></i> </a></li>
                    <li><a href="pages/examples/blank.html"><i class="fa fa-circle-o"></i> </a></li>
                    <li><a href="pages/examples/pace.html"><i class="fa fa-circle-o"></i> </a></li>
                </ul>
            </li>
            <%
                if (nomCargo.equals("Administrador")) {
            %>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-share"></i> <span>Usuario</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>



                <ul class="treeview-menu">
                    <li><a href="agregarusuario.jsp"><i class="fa fa-circle-o"></i> Registro Usuario</a></li>


                    </span>

                </ul>

            </li>



            <%
                }
            %>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-edit"></i> <span>Cita</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="agregar_cita.jsp"><i class="fa fa-circle-o"></i> Registrar Cita</a></li>


                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-edit"></i> <span>Tratamiento</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="agregar_tratamiento.jsp"><i class="fa fa-circle-o"></i> Registrar Tratamiento</a></li>
                    <li><a href="agregar_tipo.jsp"><i class="fa fa-circle-o"></i> Registrar Tipo </a></li>

                </ul>
            </li>


            <li class="treeview">
                <a href="#">
                    <i class="fa fa-edit"></i> <span>Consulta</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li><a href="listado_historial.jsp"><i class="fa fa-circle-o"></i> Consulta Historial</a></li>


                </ul>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-book"></i> <span>Reportes</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">


                    <li><a href="reporte_cita.jsp"><i class="fa fa-circle-o"></i> Reporte de Cita</a>
                    <li><a href="reporte_tratamiento.jsp"><i class="fa fa-circle-o"></i> Reporte de Tratamiento</a>

                    <li><a href="reporte_usuario.jsp"><i class="fa fa-circle-o"></i> Reporte de Usuario</a></li>


                </ul>
            </li>


            <li class="treeview">
                <a href="#">
                    <i class="fa fa-th"></i> <span>Salir</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li><a href="Login.jsp"><i class="fa fa-circle-o"></i> Cerrar</a></li>



                    </a>







                    <ul class="treeview-menu">

                        <span class="pull-right-container">
                            <i class="fa fa-angle-left pull-right"></i>
                        </span>
                        </a>

                    </ul>
            </li>
        </ul>
        </li>

        </ul>
        </li>


        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
