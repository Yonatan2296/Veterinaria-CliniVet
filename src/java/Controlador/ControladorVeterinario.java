/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Veterinario;
import Modelo.VeterinarioDAO;

import javax.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControladorVeterinario extends HttpServlet {

 
      String buscar="buscarveterinario.jsp";
   String listar="listado_veterinario.jsp";
   String agregar="agregar_veterinario.jsp";
   String editar="editarveterinario.jsp";
    
  VeterinarioDAO  dao = new VeterinarioDAO();
   
  Veterinario p= new Veterinario();
   
   int id;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
        
        
        
  
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        
        
        
        
        String acceso="";
        
        
        String action=request.getParameter("accion");
              
    
        if(action.equalsIgnoreCase("listar")) {
            
            acceso=listar;
            
        }
             
        else if(action.equalsIgnoreCase("Guardar")){
            
           
//            id=Integer.parseInt(request.getParameter(""));
            
            String nombres=request.getParameter("txtnombres");
             String dni=request.getParameter("txtdni");
             
               String direccion=request.getParameter("txtdireccion");
             String telefono=request.getParameter("txttelefono");
             String especialidad=request.getParameter("txtespecialidad");
            
            
             
//             p.setId(id);
             
             p.setNom(nombres);
             
             p.setDni(dni);
               p.setDireccion(direccion);
        
             p.setTel(telefono);
              p.setEspecialidad(especialidad);
             
   
             dao.agregar(p);
             
            
             
          acceso=listar;
            
            
            
        }
        // enviar -----------------------
        
       else if(action.equalsIgnoreCase("editar")){
            
            
            request.setAttribute("idper",request.getParameter("id"));
            
            acceso=editar;
            
        }
        
        
         
         
          else if(action.equalsIgnoreCase("Actualizar")){
            
            id=Integer.parseInt(request.getParameter("txtcodigo"));
              
              
            String nombres=request.getParameter("txtnombres");
             String dni=request.getParameter("txtdni");
             
               String direccion=request.getParameter("txtdireccion");
             String telefono=request.getParameter("txttelefono");
             String especialidad=request.getParameter("txtespecialidad");
             
            p.setId(id);
             
              p.setNom(nombres);
             
             p.setDni(dni);
               p.setDireccion(direccion);
        
             p.setTel(telefono);
              p.setEspecialidad(especialidad);
             
             
             
             
             
             
             
             dao.editar(p);
             
            acceso=listar;
            
            
            
        }
         else if(action.equalsIgnoreCase("eliminar")){
            
            id=Integer.parseInt(request.getParameter("id"));
           
            
    
             p.setId(id);
            
             
             dao.eliminar(id);
             
            acceso=listar;
            
            
            
        }
        
          else if(action.equalsIgnoreCase("Buscar")){
            
               String dato=request.getParameter("txtbuscar");
//                  String dato="";
                        
              VeterinarioDAO  hora = new  VeterinarioDAO();
        
             List<Veterinario> lista =hora.buscar(dato);
             
             request.setAttribute("datos", lista);
                request.getRequestDispatcher("buscarveterinario.jsp").forward(request, response);
            
         
            
       }
        
        
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        
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
