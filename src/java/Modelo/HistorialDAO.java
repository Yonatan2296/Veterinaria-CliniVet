/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yonatan
 */
public class HistorialDAO {
       Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Historial p= new Historial();
      public List listar(){
        
        ArrayList<Historial> list= new ArrayList<>();
            
        String  sql="SELECT mascota.cod_mascota,mascota.mascota,mascota.especie,cita.fecha,cita.hora,cita.estado,cliente.nombres FROM cita INNER JOIN mascota ON mascota.cod_mascota=cita.cod_mascota INNER JOIN  cliente ON cliente.cod_cliente=mascota.cod_cliente";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
                Historial per= new Historial();
                
                per.setCodmascota(rs.getString("cod_mascota"));
               
                per.setMascota(rs.getString("mascota"));
                
                 per.setEspecie(rs.getString("especie"));
                 
                         per.setFecha(rs.getString("fecha"));
   
                 
                      per.setHora(rs.getString("hora"));
                      
                       per.setEstado(rs.getString("estado"));
                       
                                     per.setCliente(rs.getString("nombres"));
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
}
