/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Modelo.Mascota;
import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MascotaDAO {
    
    
    Conexion cn=new Conexion();
       Conexion cnn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
       ResultSet rss;
       
       
    Mascota p= new Mascota();
    
    
        
     public List <Mascota>buscar(String dato){
              
        ArrayList<Mascota> list= new ArrayList<>();
            
        String  sql="SELECT Mascota.cod_mascota,Mascota.mascota,Mascota.especie,tipo_raza.nombre,Mascota.fecha_nacimiento,Mascota.peso,Mascota.sexo,cliente.nombres FROM Mascota  INNER JOIN cliente ON cliente.cod_cliente=Mascota.cod_cliente INNER JOIN tipo_raza ON tipo_raza.cod_raza=mascota.cod_raza where cliente.nombres like'%" + dato+"%'";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
          
                 
           Mascota per= new Mascota();
                
                per.setIdmascota(rs.getInt("cod_mascota"));
               
                per.setNombre(rs.getString("mascota"));
                
                 per.setEspecie(rs.getString("especie"));
                 
                         per.setCodraza(rs.getString("nombre"));
   
                 
                      per.setFecha(rs.getString("fecha_nacimiento"));
                      
                       per.setPeso(rs.getString("peso"));
                          per.setSexo(rs.getString("sexo"));
                       per.setCodcliente(rs.getString("nombres"));
                      
                      
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
     
     
             
     public List <Mascota>buscar2(String dato){
              
        ArrayList<Mascota> list= new ArrayList<>();
            
        String  sql="SELECT Mascota.cod_mascota,Mascota.mascota,Mascota.especie,tipo_raza.nombre,Mascota.fecha_nacimiento,Mascota.peso,Mascota.sexo,cliente.nombres FROM Mascota  INNER JOIN cliente ON cliente.cod_cliente=Mascota.cod_cliente INNER JOIN tipo_raza ON tipo_raza.cod_raza=mascota.cod_raza where cliente.nombres like'%" + dato+"%'";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
          
                 
           Mascota per= new Mascota();
                
                per.setIdmascota(rs.getInt("cod_mascota"));
               
                per.setNombre(rs.getString("mascota"));
                
                 per.setEspecie(rs.getString("especie"));
                 
                         per.setCodraza(rs.getString("nombre"));
   
                 
                      per.setFecha(rs.getString("fecha_nacimiento"));
                      
                       per.setPeso(rs.getString("peso"));
                          per.setSexo(rs.getString("sexo"));
                       per.setCodcliente(rs.getString("nombres"));
                      
                      
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
     
    public List listar(){
        
        ArrayList<Mascota> list= new ArrayList<>();
            
        String  sql="SELECT Mascota.cod_mascota,Mascota.mascota,Mascota.especie,tipo_raza.nombre,Mascota.fecha_nacimiento,Mascota.peso,Mascota.sexo,cliente.nombres FROM Mascota  INNER JOIN cliente ON cliente.cod_cliente=Mascota.cod_cliente INNER JOIN tipo_raza ON tipo_raza.cod_raza=mascota.cod_raza";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
                Mascota per= new Mascota();
                
                per.setIdmascota(rs.getInt("cod_mascota"));
               
                per.setNombre(rs.getString("mascota"));
                
                 per.setEspecie(rs.getString("especie"));
                 
                         per.setCodraza(rs.getString("nombre"));
   
                 
                      per.setFecha(rs.getString("fecha_nacimiento"));
                      
                       per.setPeso(rs.getString("peso"));
                          per.setSexo(rs.getString("sexo"));
                       per.setCodcliente(rs.getString("nombres"));
                
                 list.add(per);
            }
                       
        }catch(Exception e){
            
                     
        }
        
        return list;
        
   
    
    }
    
    
    // enviar registro al otro navegador
    
     public Mascota enviar(int id) {
         
         
               
        String  sql="SELECT * from mascota where cod_mascota="+id;
       
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            
            while (rs.next()){
                
              
                
           
                      
                      
                      
                     
               
               p.setIdmascota(rs.getInt("cod_mascota"));
               
                p.setNombre(rs.getString("mascota"));
                
                 p.setEspecie(rs.getString("especie"));
                 
                         p.setCodraza(rs.getString("cod_raza"));
   
                 
                      p.setFecha(rs.getString("fecha_nacimiento"));
                      
                       p.setPeso(rs.getString("peso"));
                         p.setSexo(rs.getString("sexo"));
                       p.setCodcliente(rs.getString("cod_cliente"));
                
            }
                       
        }catch(Exception e){
            
                     
        }
         return p;
         
     }
        public ResultSet mostrartipo_raza(){
        
         String  sql="select  cod_raza,nombre from  tipo_raza";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            

                       
        }catch(Exception e){
            
                     
        }
        
        return rs;
    }
     
      public ResultSet mostrarcliente(){
        
         String  sql="select  cod_cliente,nombres from  cliente";
        
        try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);          
            rs= ps.executeQuery();
            

                       
        }catch(Exception e){
            
                     
        }
        
        return rs;
    }
      
      
     //  agregar o guardar registro ----------------------
     
    public boolean agregar(Mascota per){
        
        
        String sql="insert into Mascota (mascota,especie,cod_raza,fecha_nacimiento,peso,sexo,cod_cliente) values(?,?,?,?,?,?,?)";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
         
          
          ps.setString(1,per.getNombre()); 
          
           ps.setString(2,per.getEspecie());
           
              ps.setString(3,per.getCodraza());
              
            ps.setString(4,per.getFecha());
            
             ps.setString(5,per.getPeso());
          
              ps.setString(6,per.getSexo());
              
               ps.setString(7,per.getCodcliente());
             
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    public boolean editar(Mascota per){
        
        
        String sql="update Mascota set  mascota=?,especie=?,cod_raza=?,fecha_nacimiento=?,peso=?,sexo=?,cod_cliente=?  where cod_mascota=?";
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
            
               
            
      
           
                ps.setString(1,per.getNombre()); 
          
           ps.setString(2,per.getEspecie());
           
              ps.setString(3,per.getCodraza());
              
            ps.setString(4,per.getFecha());
            
             ps.setString(5,per.getPeso());
          
              ps.setString(6,per.getSexo());
              
               ps.setString(7,per.getCodcliente());
               
        
             ps.setInt(8,per.getIdmascota()); 
          
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
    
    
    public boolean eliminar(int id){
        
        
        String sql="delete from Mascota  where cod_Mascota="+id;
        
          try{          
            con=cn.getConnection();
            ps=con.prepareStatement(sql);        
                 
            ps.executeUpdate();
            
          }catch (Exception e){
                                       
          }
        return  false;
        
    }
    
}
