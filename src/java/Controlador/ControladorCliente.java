package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorCliente extends HttpServlet {

//  String buscar="buscarcliente.jsp";
    String listar = "listado_cliente.jsp";
    String agregar = "agregar_cliente.jsp";
    String editar = "editarcliente.jsp";

    ClienteDAO dao = new ClienteDAO();

    Cliente p = new Cliente();

    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);

        String acceso = "";

        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {

            acceso = listar;

        } else if (action.equalsIgnoreCase("Guardar")) {

//            id=Integer.parseInt(request.getParameter(""));
            String nom = request.getParameter("txtnombres");
            String dni = request.getParameter("txtdni");

            String dire = request.getParameter("txtdireccion");
            String tel = request.getParameter("txttelefono");
            String email = request.getParameter("txtemail");

            p.setId(id);

            p.setNom(nom);
            p.setDni(dni);
            p.setDireccion(dire);

            p.setTel(tel);
            p.setEmail(email);

            dao.agregar(p);

            acceso = listar;

        } // enviar -----------------------
        else if (action.equalsIgnoreCase("editar")) {

            request.setAttribute("idper", request.getParameter("id"));

            acceso = editar;

        } else if (action.equalsIgnoreCase("Actualizar")) {

            id = Integer.parseInt(request.getParameter("txtcodigo"));
            String nom = request.getParameter("txtnombres");
            String dni = request.getParameter("txtdni");
            String dire = request.getParameter("txtdireccion");
            String tel = request.getParameter("txttelefono");
            String email = request.getParameter("txtemail");

            p.setId(id);

            p.setNom(nom);
            p.setDni(dni);
            p.setDireccion(dire);

            p.setTel(tel);
            p.setEmail(email);

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

            ClienteDAO hora = new ClienteDAO();

            List<Cliente> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscarcliente.jsp").forward(request, response);

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
