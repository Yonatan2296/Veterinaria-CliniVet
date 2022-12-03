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
 * @author staw
 */
public class HistorialConsultaDAO {

    Conexion cn = new Conexion();

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    Historial p = new Historial();

    public List<Historial> buscar(String dato) {

        ArrayList<Historial> list = new ArrayList<>();

        String sql = "SELECT        historial.cod_historial,  mascota.mascota, mascota.especie, historial.diagnostico, tipo_tratamiento.nombre, historial.receta, historial.fecha,  cliente.nombres\n"
                + "FROM            historial INNER JOIN\n"
                + "                         mascota ON historial.cod_mascota = mascota.cod_mascota INNER JOIN\n"
                + "                         cliente ON mascota.cod_cliente = cliente.cod_cliente INNER JOIN\n"
                + "                         tipo_tratamiento ON historial.cod_tratamiento = tipo_tratamiento.cod_tratamiento where cliente.nombres like'%" + dato + "%'";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Historial per = new Historial();

                per.setId(rs.getInt("cod_historial"));

                per.setNombremascota(rs.getString("mascota"));

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

        String sql = "SELECT        historial.cod_historial,  mascota.mascota, mascota.especie, historial.diagnostico, tipo_tratamiento.nombre, historial.receta, historial.fecha,  cliente.nombres\n"
                + "FROM            historial INNER JOIN\n"
                + "                         mascota ON historial.cod_mascota = mascota.cod_mascota INNER JOIN\n"
                + "                         cliente ON mascota.cod_cliente = cliente.cod_cliente INNER JOIN\n"
                + "                         tipo_tratamiento ON historial.cod_tratamiento = tipo_tratamiento.cod_tratamiento";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Historial per = new Historial();

                per.setId(rs.getInt("cod_historial"));

                per.setNombremascota(rs.getString("mascota"));

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
