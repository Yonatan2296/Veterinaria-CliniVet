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


public class CitaDAO {
    
    
    Conexion cn=new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Cita p= new Cita();
    
    
        
     public List <Cita>buscar(String dato){
              
        ArrayList<Cita> list= new ArrayList<>();
            
        String  sql="SELECT cita.cod_cita,cita.fecha,cita.hora,cliente.nombres,mascota.mascota,mascota.especie,cita.estado FROM cita INNER JOIN cliente ON cliente.cod_cliente=cita.cod_cliente INNER JOIN  mascota ON mascota.cod_cliente=cliente.cod_cliente where cliente.nombres like'%" + dato+"%'";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
          
                 
                
                      
                      
                       Cita per= new Cita();
                
                per.setId(rs.getInt("cod_cita"));
               
                per.setFecha(rs.getString("fecha"));
                
                 per.setHora(rs.getString("hora"));
                 
                         per.setCodcliente(rs.getString("nombres"));
                 per.setMascota(rs.getString("mascota"));
                 
                      per.setEspecie(rs.getString("especie"));
                      
                        per.setEstado(rs.getString("estado"));
                        
                        
                        
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
     
     
    public List listar(){
        
        ArrayList<Cita> list= new ArrayList<>();
            
        String  sql="SELECT cita.cod_cita,cita.fecha,cita.hora,cliente.nombres,mascota.mascota,mascota.especie,cita.estado FROM cita INNER JOIN cliente ON cliente.cod_cliente=cita.cod_cliente INNER JOIN  mascota ON mascota.cod_cliente=cliente.cod_cliente";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
                Cita per= new Cita();
                
                per.setId(rs.getInt("cod_cita"));
               
                per.setFecha(rs.getString("fecha"));
                
                 per.setHora(rs.getString("hora"));
                 
                         per.setCodcliente(rs.getString("nombres"));
                 per.setMascota(rs.getString("mascota"));
                 
                      per.setEspecie(rs.getString("especie"));
                      
                        per.setEstado(rs.getString("estado"));
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
    
     public List listarclientemascota(){
        
        ArrayList<Cita> list= new ArrayList<>();
            
        String  sql="SELECT Mascota.cod_mascota,Mascota.mascota,Mascota.especie,tipo_raza.nombre,Mascota.fecha_nacimiento,Mascota.peso,Mascota.sexo,cliente.nombres FROM Mascota  INNER JOIN cliente ON cliente.cod_cliente=Mascota.cod_cliente INNER JOIN tipo_raza ON tipo_raza.cod_raza=mascota.cod_raza";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
                Cita per= new Cita();
                
                per.setId(rs.getInt("cd_mascota"));
               
                per.setFecha(rs.getString("mascota"));
                
                 per.setHora(rs.getString("especie"));
                 
                         per.setCodcliente(rs.getString("fecha_nacimiento"));
                 per.setMascota(rs.getString("peso"));
                 
                      per.setEspecie(rs.getString("sexo"));
                      
                        per.setEstado(rs.getString("nombres"));
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
        // enviar registro al otro navegador
    
      public Cita enviar(int id) {
         
         
               
        String  sql="SELECT * from mascota where cod_mascota="+id;
       
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
              
                
           
                      
                      
                      
                     
               
               p.setCodmascota(rs.getString("cod_mascota"));
               
                p.setMascota(rs.getString("mascota"));
                
              
                
            }
                       
        }catch(Exception e){
            
                     
        }
         return p;
         
     }
     //  agregar o guardar registro ----------------------
     
    public boolean agregar(Cita per){
        
        
        String sql="insert into cita(fecha,hora,cod_mascota,estado) values(?,?,?,?)";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
         
          
          ps.setString(1,per.getFecha()); 
          
           ps.setString(2,per.getHora());
           
              ps.setString(3,per.getCodmascota());
              
            ps.setString(4,per.getEstado());
            
            
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    
    
    public boolean eliminar(int id){
        
        
        String sql="delete from Cita  where cod_mascota="+id;
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
                 
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
}
