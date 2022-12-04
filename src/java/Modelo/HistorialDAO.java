/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Historial;
import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HistorialDAO {

    Conexion cn = new Conexion();

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    Historial p = new Historial();

    public List<Historial> buscar(String dato) {

        ArrayList<Historial> list = new ArrayList<>();

        String sql = "SELECT historial.cod_historial,mascota.mascota,mascota.especie,historial.diagnostico,tipo_tratamiento.nombre,historial.receta,historial.fecha,cliente.nombres FROM historial INNER JOIN mascota ON mascota.cod_mascota=historial.cod_mascota INNER JOIN cliente ON cliente.cod_cliente=mascota.cod_mascota INNER JOIN tipo_tratamiento ON tipo_tratamiento.cod_tratamiento=historial.cod_tratamiento where cliente.nombres like'%" + dato + "%'";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Historial per = new Historial();

                per.setId(rs.getInt("cod_historial"));

                per.setCodmascota(rs.getString("mascota"));

                per.setEspecie(rs.getString("especie"));

                per.setDiagnostico(rs.getString("diagnostico"));

                per.setCodtratamiento(rs.getString("nombre"));

                per.setReceta(rs.getString("receta"));

                per.setFecha(rs.getString("fecha"));

                per.setCliente(rs.getString("nombres"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }

    public List listado() {

        ArrayList<Historial> list = new ArrayList<>();

        String sql = "SELECT historial.cod_historial,mascota.mascota,mascota.especie,historial.diagnostico,tipo_tratamiento.nombre,historial.receta,historial.fecha,cliente.nombres FROM historial INNER JOIN mascota ON mascota.cod_mascota=historial.cod_mascota INNER JOIN cliente ON cliente.cod_cliente=mascota.cod_mascota INNER JOIN tipo_tratamiento ON tipo_tratamiento.cod_tratamiento=historial.cod_tratamiento";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Historial per = new Historial();

                per.setId(rs.getInt("cod_historial"));

                per.setCodmascota(rs.getString("mascota"));

                per.setEspecie(rs.getString("especie"));

                per.setDiagnostico(rs.getString("diagnostico"));

                per.setCodtratamiento(rs.getString("nombre"));
                per.setReceta(rs.getString("receta"));

                per.setFecha(rs.getString("fecha"));

                per.setCliente(rs.getString("nombres"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }

    public List listar() {

        ArrayList<Historial> list = new ArrayList<>();

        String sql = "SELECT mascota.cod_mascota,mascota.mascota,mascota.especie,cita.fecha,cita.hora,cita.estado,cliente.nombres FROM cita INNER JOIN mascota ON mascota.cod_mascota=cita.cod_mascota INNER JOIN  cliente ON cliente.cod_cliente=mascota.cod_cliente";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Historial per = new Historial();

                per.setCodmascota(rs.getString("cod_mascota"));

                per.setMascota(rs.getString("mascota"));

                per.setEspecie(rs.getString("especie"));

                per.setFecha(rs.getString("fecha"));

                per.setHora(rs.getString("hora"));

                per.setEstado(rs.getString("estado"));

                per.setCliente(rs.getString("nombres"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }

    public List<Historial> buscar2(String dato) {

        ArrayList<Historial> list = new ArrayList<>();

        String sql = "SELECT mascota.cod_mascota,mascota.mascota,mascota.especie,cita.fecha,cita.hora,cita.estado,cliente.nombres FROM cita INNER JOIN mascota ON mascota.cod_mascota=cita.cod_mascota INNER JOIN  cliente ON cliente.cod_cliente=mascota.cod_cliente where cliente.nombres like'%" + dato + "%'";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Historial per = new Historial();

                per.setCodmascota(rs.getString("cod_mascota"));

                per.setMascota(rs.getString("mascota"));

                per.setEspecie(rs.getString("especie"));

                per.setFecha(rs.getString("fecha"));

                per.setHora(rs.getString("hora"));

                per.setEstado(rs.getString("estado"));

                per.setCliente(rs.getString("nombres"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }
//    public List listarcliente(){
//        
//        ArrayList<Mascota> list= new ArrayList<>();
//            
//        String  sql="SELECT Mascota.cod_mascota,Mascota.mascota,Mascota.especie,tipo_raza.nombre,Mascota.fecha_nacimiento,Mascota.peso,Mascota.sexo,cliente.nombres FROM Mascota  INNER JOIN cliente ON cliente.cod_cliente=Mascota.cod_cliente INNER JOIN tipo_raza ON tipo_raza.cod_raza=mascota.cod_raza";
//        
//        try{          
//            con=cn.getConnection();
//            ps=con.prepareStatement(sql);          
//            rs= ps.executeQuery();
//            
//            while (rs.next()){
//                
//                Mascota per= new Mascota();
//                
//                per.setIdmascota(rs.getInt("cod_mascota"));
//               
//                per.setNombre(rs.getString("mascota"));
//                
//                 per.setEspecie(rs.getString("especie"));
//                 
//                         per.setCodraza(rs.getString("nombre"));
//   
//                 
//                      per.setFecha(rs.getString("fecha_nacimiento"));
//                      
//                       per.setPeso(rs.getString("peso"));
//                          per.setSexo(rs.getString("sexo"));
//                       per.setCodcliente(rs.getString("nombres"));
//                
//                 list.add(per);
//            }
//                       
//        }catch(Exception e){
//            
//                     
//        }
//        
//        return list;
//        
//   
//    
//    }

    // enviar registro al otro navegador
    public Historial enviar(int id) {

        String sql = "SELECT * from cita  where cod_mascota=" + id;

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                p.setCodmascota(rs.getString("cod_mascota"));

                p.setFecha(rs.getString("fecha"));
                p.setHora(rs.getString("hora"));
                p.setEstado(rs.getString("estado"));
//                                     p.setCliente(rs.getString("nombres"));
            }

        } catch (Exception e) {

        }
        return p;

    }

    public ResultSet mostrartipo_tratamiento() {

        String sql = "select  cod_tratamiento,nombre from  tipo_tratamiento";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }

        return rs;
    }

    public ResultSet mostrarusuario() {

        String sql = "select  codigo,usuario from  usuario";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }

        return rs;
    }
    //  agregar o guardar registro ----------------------

    public boolean agregar(Historial per) {

        String sql = "insert into Historial (cod_mascota,diagnostico,cod_tratamiento,receta,codigo,fecha) values(?,?,?,?,?,?)";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, per.getCodmascota());

            ps.setString(2, per.getDiagnostico());

            ps.setString(3, per.getCodtratamiento());

            ps.setString(4, per.getReceta());

            ps.setString(5, per.getCodigo());

            ps.setString(6, per.getFecha());

            if (ps.executeUpdate() > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;

    }

    public boolean editar(Historial per) {

        String sql = "update Historial set  cod_mascota=?,diagnostico=?,cod_tratamiento=?,receta=?,codigo=?,fecha=? where cod_historial=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, per.getCodmascota());

            ps.setString(2, per.getDiagnostico());

            ps.setString(3, per.getCodtratamiento());

            ps.setString(4, per.getReceta());

            ps.setString(5, per.getCodigo());

            ps.setString(6, per.getFecha());

            ps.setInt(7, per.getId());

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

    public boolean eliminar(int id) {

        String sql = "delete from Historial  where cod_Historial=" + id;

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

}
