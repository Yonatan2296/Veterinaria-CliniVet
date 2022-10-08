/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Modelo.Usuario;

import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsuarioDAO {
     
    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

  
    
    
    Usuario p= new Usuario();
    
    
        
     public List <Usuario>buscar(String dato){
              
        ArrayList<Usuario> list= new ArrayList<>();
            
        String  sql="SELECT * from usuario  where usuario  like'%" + dato+"%'";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
          
               Usuario per= new Usuario();
                
                  per.setId(rs.getInt("codigo"));;
               
                per.setUsuario(rs.getString("usuario"));
                
                 per.setContra(rs.getString("contraseña"));
                 
                  per.setCargo(rs.getInt("cargo"));
                      
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
     
     
     
     
    public List listar(){
        
        ArrayList<Usuario> list= new ArrayList<>();
            
        String  sql="select  * from  Usuario";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
                Usuario per= new Usuario();
                
                  per.setId(rs.getInt("codigo"));;
               
                per.setUsuario(rs.getString("usuario"));
                
                 per.setContra(rs.getString("contraseña"));
                 
                  per.setCargo(rs.getInt("cargo"));
               
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
    
    
    // enviar registro al otro navegador
    
     public Usuario enviar(int id) {
         
         
           String  sql="select  * from  Usuario  where codigo="+id;
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
              
                
           p.setId(rs.getInt("codigo"));
               
               
                p.setUsuario(rs.getString("usuario"));
                
                 p.setContra(rs.getString("contraseña"));
                 
                     p.setCargo(rs.getInt("cargo"));
                 
              
                
                
            }
                       
        }catch(Exception e){
            
                     
        }
         return p;
         
     }
    
     //  agregar o guardar registro ----------------------
     
    public boolean agregar(Usuario per){
        
        
        String sql="insert into Usuario(usuario,contraseña,cargo) values(?,?,?)";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
  
          
          ps.setString(1,per.getUsuario()); 
          
           ps.setString(2,per.getContra());
           
              ps.setInt(3,per.getCargo());
              
          
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    public boolean editar(Usuario per){
        
        
        String sql="update Usuario set  usuario=?,contraseña=?,cargo=? where codigo=?";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
               
            
          ps.setString(1,per.getUsuario()); 
          
           ps.setString(2,per.getContra());
           
              ps.setInt(3,per.getCargo());
              
              
            ps.setInt(4,per.getId());
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    
    public boolean eliminar(int id){
        
        
        String sql="delete from Usuario where codigo="+id;
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
                 
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    public int login(String usuario,String contraseña) {
       
//
       int cargo=0;
        
        try {
           String  sql = "SELECT cargo from usuario where usuario='"+usuario+"' and contraseña ='"+contraseña+"'";
           
           
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
        while(rs.next()){
            
            
            cargo=rs.getInt(1);
            
        }
           con.close();
           
           rs.close();
           
           return cargo;
    
        } catch (SQLException  e) {

           

            return cargo;

        }

    }

    }
    
    

