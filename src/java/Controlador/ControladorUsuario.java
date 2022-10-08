
package Controlador;


import Modelo.Usuario;
import Modelo.UsuarioDAO;

import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ControladorUsuario extends HttpServlet {

    String listar = "listarusuario.jsp";
    String agregar = "agregarusuario.jsp";
    String editar = "editarusuario.jsp";

    UsuarioDAO dao = new UsuarioDAO();

    Usuario p = new Usuario();

    int id;
    int car;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String usu;
            String contra;
            int cargo = 0;

            UsuarioDAO dao = new UsuarioDAO();

            RequestDispatcher rd = null;

            if (request.getParameter("btnIngresar") != null) {

                usu = request.getParameter("txtusuario");

                contra = request.getParameter("txtcontra");

                cargo = dao.login(usu, contra);

                request.setAttribute("cargo", cargo);
                request.setAttribute("usu", usu);

                rd = request.getRequestDispatcher("Login.jsp");

            }

            rd.forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";

        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {

            acceso = listar;

        } else if (action.equalsIgnoreCase("Guardar")) {

//         id=Integer.parseInt(request.getParameter("txtcodigo"));
            String nom = request.getParameter("txtusuario");
            String con = request.getParameter("txtcontraseña");

            car = Integer.parseInt(request.getParameter("txtcargo"));

//             p.setId(id);
            p.setUsuario(nom);
            p.setContra(con);
            p.setCargo(car);

            dao.agregar(p);

            acceso = listar;

        } else if (action.equalsIgnoreCase("editar")) {

            request.setAttribute("idper", request.getParameter("id"));

            acceso = editar;

        } else if (action.equalsIgnoreCase("Actualizar")) {

            id = Integer.parseInt(request.getParameter("txtcodigo"));

            String nom = request.getParameter("txtusuario");
            String con = request.getParameter("txtcontraseña");

            car = Integer.parseInt(request.getParameter("txtcargo"));

            p.setId(id);

            p.setUsuario(nom);
            p.setContra(con);
            p.setCargo(car);

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

            UsuarioDAO hora = new UsuarioDAO();

            List<Usuario> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscarusuario.jsp").forward(request, response);

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
