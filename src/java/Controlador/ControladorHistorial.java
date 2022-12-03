/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Historial;
import Modelo.HistorialDAO;
import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Star
 */
public class ControladorHistorial extends HttpServlet {

    String buscar = "buscarhistorial.jsp";

    String listar = "agregar_tratamiento.jsp";

    String Buscar2 = "buscar_cita.jsp";

    String agregar = "agregar_historial.jsp";

    String editar = "editartratamiento.jsp";

//      String listartratamiento="agregar_tratamiento.jsp";
    HistorialDAO dao = new HistorialDAO();

    Historial p = new Historial();

    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);

        String acceso = "";

        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {

            acceso = listar;

        } else if (action.equalsIgnoreCase("Guardar")) {

//            id=Integer.parseInt(request.getParameter(""));
            String mascota = request.getParameter("txtcodigo");
            String diagnostico = request.getParameter("txtdiagnostico");

            String codtratamiento = request.getParameter("cbotipo");
            String receta = request.getParameter("txtreceta");
            String codigo = request.getParameter("cbousuario");
            String fecha = request.getParameter("txtfecha");

//             p.setId(id);
            p.setCodmascota(mascota);

            p.setDiagnostico(diagnostico);
            p.setCodtratamiento(codtratamiento);

            p.setReceta(receta);
            p.setCodigo(codigo);

            p.setFecha(fecha);

            dao.agregar(p);

            acceso = listar;

        } // enviar -----------------------
        else if (action.equalsIgnoreCase("editar")) {

            request.setAttribute("idper", request.getParameter("id"));

            acceso = editar;

        } else if (action.equalsIgnoreCase("Actualizar")) {

            id = Integer.parseInt(request.getParameter("txtcodigo"));

            String mascota = request.getParameter("txtcodmascota");
            String diagnostico = request.getParameter("txtdiagnostico");

            String codtratamiento = request.getParameter("cbotratamiento");
            String receta = request.getParameter("txtreceta");
            String codigo = request.getParameter("cbousuario");
            String fecha = request.getParameter("txtfecha");

            p.setId(id);

            p.setCodmascota(mascota);

            p.setDiagnostico(diagnostico);
            p.setCodtratamiento(codtratamiento);

            p.setReceta(receta);
            p.setCodigo(codigo);

            p.setFecha(fecha);

            dao.editar(p);

            acceso = listar;

        } else if (action.equalsIgnoreCase("eliminar")) {

            id = Integer.parseInt(request.getParameter("id"));

            p.setId(id);

            dao.eliminar(id);

            acceso = listar;

        } else if (action.equalsIgnoreCase("Buscar")) {

            String dato = request.getParameter("txtbuscar");
//                  String dato="";

            HistorialDAO hora = new HistorialDAO();

            List<Historial> lista = hora.buscar2(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscar_cita.jsp").forward(request, response);

        } else if (action.equalsIgnoreCase("Buscar")) {

            String dato = request.getParameter("txtbuscar");
//                  String dato="";

            HistorialDAO hora = new HistorialDAO();

            List<Historial> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscarhistorial.jsp").forward(request, response);

        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);

        vista.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
