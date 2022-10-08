
package Controlador;

import Modelo.Mascota;
import Modelo.MascotaDAO;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Star
 */
public class ControladorMascota extends HttpServlet {

    String buscar = "buscar_mascota_cita.jsp";
    String listar = "listado_mascota.jsp";
    String agregar = "agregar_mascota.jsp";
    String editar = "editar_mascota.jsp";

    MascotaDAO dao = new MascotaDAO();

    Mascota p = new Mascota();

    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //   processRequest(request, response);

        String acceso = "";

        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {

            acceso = listar;

        } else if (action.equalsIgnoreCase("Guardar")) {

//            id=Integer.parseInt(request.getParameter(""));
            String mascota = request.getParameter("txtnombres");
            String especie = request.getParameter("txtespecie");

            String codraza = request.getParameter("cboraza");
            String fecha = request.getParameter("txtfecha");
            String peso = request.getParameter("txtpeso");
            String sexo = request.getParameter("txtsexo");
            String codcliente = request.getParameter("cbocliente");

//             p.setId(id);
            p.setNombre(mascota);

            p.setEspecie(especie);
            p.setCodraza(codraza);

            p.setFecha(fecha);
            p.setPeso(peso);

            p.setSexo(sexo);
            p.setCodcliente(codcliente);
            dao.agregar(p);

            acceso = listar;

        } // enviar -----------------------
        else if (action.equalsIgnoreCase("editar")) {

            request.setAttribute("idper", request.getParameter("id"));

            acceso = editar;

        } else if (action.equalsIgnoreCase("Actualizar")) {

            id = Integer.parseInt(request.getParameter("txtcodigo"));

            String mascota = request.getParameter("txtnombres");
            String especie = request.getParameter("txtespecie");

            String codraza = request.getParameter("cboraza");
            String fecha = request.getParameter("txtfecha");
            String peso = request.getParameter("txtpeso");
            String sexo = request.getParameter("txtsexo");
            String codcliente = request.getParameter("cbocliente");

            p.setIdmascota(id);

            p.setNombre(mascota);

            p.setEspecie(especie);
            p.setCodraza(codraza);

            p.setFecha(fecha);
            p.setPeso(peso);

            p.setSexo(sexo);
            p.setCodcliente(codcliente);

            p.setFecha(fecha);

            dao.editar(p);

            acceso = listar;

        } else if (action.equalsIgnoreCase("eliminar")) {

            id = Integer.parseInt(request.getParameter("id"));

            p.setIdmascota(id);

            dao.eliminar(id);

            acceso = listar;

        } else if (action.equalsIgnoreCase("Buscar")) {

            String dato = request.getParameter("txtbuscar");
//                  String dato="";

            MascotaDAO hora = new MascotaDAO();

            List<Mascota> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscar_mascota_cita.jsp").forward(request, response);

        } else if (action.equalsIgnoreCase("Buscar")) {

            String dato = request.getParameter("txtbuscar");
//                  String dato="";

            MascotaDAO hora = new MascotaDAO();

            List<Mascota> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscarmascota.jsp").forward(request, response);

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
