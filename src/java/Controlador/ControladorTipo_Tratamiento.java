/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Tipo_Tratamiento;
import Modelo.Tipo_TratamientoDAO;

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
public class ControladorTipo_Tratamiento extends HttpServlet {

    String buscar = "buscartipo.jsp";
    String listar = "listado_tipo.jsp";
    String agregar = "agregar_tipo.jsp";
    String editar = "editar_tipo.jsp";

    Tipo_TratamientoDAO dao = new Tipo_TratamientoDAO();

    Tipo_Tratamiento p = new Tipo_Tratamiento();

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
            String nombre = request.getParameter("txtnombre");
            String precio = request.getParameter("txtprecio");

            String codveterinario = request.getParameter("cboveterinario");

//             p.setId(id);
            p.setNombre(nombre);

            p.setPrecio(precio);
            p.setCodveterinario(codveterinario);

            dao.agregar(p);

            acceso = listar;

        } // enviar -----------------------
        else if (action.equalsIgnoreCase("editar")) {

            request.setAttribute("idper", request.getParameter("id"));

            acceso = editar;

        } else if (action.equalsIgnoreCase("Actualizar")) {

            id = Integer.parseInt(request.getParameter("txtcodigo"));

            String nombre = request.getParameter("txtnombre");

            String precio = request.getParameter("txtprecio");

            String codveterinario = request.getParameter("cboveterinario");

            p.setId(id);

            p.setNombre(nombre);

            p.setPrecio(precio);

            p.setCodveterinario(codveterinario);

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

            Tipo_TratamientoDAO hora = new Tipo_TratamientoDAO();

            List<Tipo_Tratamiento> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscartipo.jsp").forward(request, response);

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
