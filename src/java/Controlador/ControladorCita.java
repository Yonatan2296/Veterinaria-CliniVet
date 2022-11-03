
package Controlador;

import Modelo.Cita;
import Modelo.CitaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControladorCita extends HttpServlet {

  
    String buscar = "buscarcita.jsp";
    String listar = "agregar_tratamiento.jsp";
    String agregar = "agregar_cita.jsp";

    String editar = "editarcita.jsp";

    CitaDAO dao = new CitaDAO();

    Cita p = new Cita();

    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);

        String acceso = "";

        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {

            acceso = listar;

        } else if (action.equalsIgnoreCase("Guardar")) {

//            id=Integer.parseInt(request.getParameter(""));
            String fecha = request.getParameter("txtfecha");

            String hora = request.getParameter("txthora");
            String cliente = request.getParameter("txtcodigo");
            String estado = request.getParameter("cboestado");

//             p.setId(id);
            p.setFecha(fecha);
            p.setHora(hora);
            p.setCodmascota(cliente);

            p.setEstado(estado);

            dao.agregar(p);

            acceso = listar;

        } // enviar -----------------------
        else if (action.equalsIgnoreCase("editar")) {

            request.setAttribute("idper", request.getParameter("id"));

            acceso = editar;

        } else if (action.equalsIgnoreCase("eliminar")) {

            id = Integer.parseInt(request.getParameter("id"));

            p.setId(id);

            dao.eliminar(id);

            acceso = listar;

        } else if (action.equalsIgnoreCase("Buscar")) {

            String dato = request.getParameter("txtbuscar");
//                  String dato="";

            CitaDAO hora = new CitaDAO();

            List<Cita> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscarcita.jsp").forward(request, response);

        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);

        vista.forward(request, response);

    }


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
