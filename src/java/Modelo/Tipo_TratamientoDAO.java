/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Tipo_Tratamiento;
import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;


public class Tipo_TratamientoDAO {
    



    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
   Tipo_Tratamiento p= new Tipo_Tratamiento();
    
   
   
        
     public List <Tipo_Tratamiento>buscar(String dato){
              
        ArrayList<Tipo_Tratamiento> list= new ArrayList<>();
            
        String  sql="SELECT tipo_tratamiento.cod_tratamiento,Tipo_Tratamiento.nombre,Tipo_Tratamiento.precio,veterinario.nombres FROM Tipo_Tratamiento INNER JOIN veterinario ON veterinario.cod_veterinario=Tipo_Tratamiento.cod_veterinario  where nombre like'%" + dato+"%'";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
          
                  Tipo_Tratamiento per= new Tipo_Tratamiento();
                
                per.setId(rs.getInt("cod_tratamiento"));
               
                per.setNombre(rs.getString("nombre"));
                
                 per.setPrecio(rs.getString("precio"));
                 
                         per.setCodveterinario(rs.getString("nombres"));
                      
                
                 list.add(per);
            }
                       
   }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
     
     
    public List listar(){
        
        ArrayList<Tipo_Tratamiento> list= new ArrayList<>();
            
        String  sql="SELECT tipo_tratamiento.cod_tratamiento,Tipo_Tratamiento.nombre,Tipo_Tratamiento.precio,veterinario.nombres FROM Tipo_Tratamiento INNER JOIN veterinario ON veterinario.cod_veterinario=Tipo_Tratamiento.cod_veterinario";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
               Tipo_Tratamiento per= new Tipo_Tratamiento();
                
                per.setId(rs.getInt("cod_tratamiento"));
               
                per.setNombre(rs.getString("nombre"));
                
                 per.setPrecio(rs.getString("precio"));
                 
                         per.setCodveterinario(rs.getString("nombres"));
   
                 
                    
                
                 list.add(per);
            }
                       
    }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
    
    
    // enviar registro al otro navegador
    
     public Tipo_Tratamiento enviar(int id) {
                   
        String  sql="select * from tipo_tratamiento where cod_tratamiento="+id;
       
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
              
               
                 p.setId(rs.getInt("cod_tratamiento"));
               
                p.setNombre(rs.getString("nombre"));
                
                 p.setPrecio(rs.getString("precio"));
                 
//                       p.setCodveterinario(rs.getString("cod_veterinario"));
                
            }
                       
    }catch(Exception e){
            
                     
        }
         return p;
         
     }
    
     
           public ResultSet mostrarveterinario(){
        
         String  sql="select  cod_veterinario,nombres from  veterinario";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            

      }catch(Exception e){
            
                     
        }
        
        return rs;
    }
           
     //  agregar o guardar registro ----------------------
     
    public boolean agregar(Tipo_Tratamiento per){
        
        
        String sql="insert into tipo_tratamiento (nombre,precio,cod_veterinario) values(?,?,?)";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
         
          
          ps.setString(1,per.getNombre()); 
          
           ps.setString(2,per.getPrecio());
           
              ps.setString(3,per.getCodveterinario());
         
            ps.executeUpdate();
            
   }catch(Exception e){
                                       
          }
        return  false;
        
    }
    
    
    public boolean editar(Tipo_Tratamiento per){
        
        
        String sql="update Tipo_Tratamiento set  nombre=?,precio=?,cod_veterinario=?  where cod_tratamiento=?";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
               
            
      
             
          ps.setString(1,per.getNombre()); 
          
           ps.setString(2,per.getPrecio());
           
              ps.setString(3,per.getCodveterinario());
              
             
               
        
             ps.setInt(4,per.getId()); 
          
            ps.executeUpdate();
            
            }catch(Exception e){
                                       
          }
        return  false;
        
    }
    
    
    
    public boolean eliminar(int id){
        
        
        String sql="delete from Tipo_Tratamiento  where cod_tratamiento="+id;
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
                 
            ps.executeUpdate();
            
          }catch(Exception e){
                                       
          }
        return  false;
        
    }
    
}
