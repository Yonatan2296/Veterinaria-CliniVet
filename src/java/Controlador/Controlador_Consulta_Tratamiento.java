/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Historial;
import Modelo.HistorialConsultaDAO;

import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador_Consulta_Tratamiento extends HttpServlet {

    String buscar = "buscar_historial.jsp";

    String listar = "listado_historial.jsp";

    HistorialConsultaDAO dao = new HistorialConsultaDAO();

    Historial p = new Historial();

    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";

        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {

            acceso = listar;

        } else if (action.equalsIgnoreCase("eliminar")) {

            id = Integer.parseInt(request.getParameter("id"));

            p.setId(id);

            dao.eliminar(id);

            acceso = listar;

        } else if (action.equalsIgnoreCase("Buscar")) {

            String dato = request.getParameter("txtbuscar");
//                  String dato="";

            HistorialConsultaDAO hora = new HistorialConsultaDAO();

            List<Historial> lista = hora.buscar(dato);

            request.setAttribute("datos", lista);
            request.getRequestDispatcher("buscar_historial.jsp").forward(request, response);

        }

//           else if(action.equalsIgnoreCase("Buscar")){
//            
//               String dato=request.getParameter("txtbuscar");
////                  String dato="";
//                        
//             HistorialConsultaDAO  hora = new  HistorialConsultaDAO();
//        
//             List<Historial> lista =hora.buscar(dato);
//             
//             request.setAttribute("datos", lista);
//                request.getRequestDispatcher("buscar_historiales.jsp").forward(request, response);
//            
//         
//            
//       }
//        
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
