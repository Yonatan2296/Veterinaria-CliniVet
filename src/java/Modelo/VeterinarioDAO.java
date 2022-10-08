/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Veterinario;
import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioDAO {

    Conexion cn = new Conexion();

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    Veterinario p = new Veterinario();

    public List<Veterinario> buscar(String dato) {

        ArrayList<Veterinario> list = new ArrayList<>();

        String sql = "SELECT * from Veterinario   where nombres like'%" + dato + "%'";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Veterinario per = new Veterinario();

                per.setId(rs.getInt("cod_Veterinario"));

                per.setNom(rs.getString("nombres"));

                per.setDni(rs.getString("dni"));

                per.setDireccion(rs.getString("direccion"));

                per.setTel(rs.getString("telefono"));

                per.setEspecialidad(rs.getString("especialidad"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }

    public List listar() {

        ArrayList<Veterinario> list = new ArrayList<>();

        String sql = "SELECT * from Veterinario";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Veterinario per = new Veterinario();

                per.setId(rs.getInt("cod_Veterinario"));

                per.setNom(rs.getString("nombres"));

                per.setDni(rs.getString("dni"));

                per.setDireccion(rs.getString("direccion"));

                per.setTel(rs.getString("telefono"));

                per.setEspecialidad(rs.getString("especialidad"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }

    // enviar registro al otro navegador
    public Veterinario enviar(int id) {

        String sql = "SELECT * from Veterinario where cod_veterinario=" + id;

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                p.setId(rs.getInt("cod_veterinario"));

                p.setNom(rs.getString("nombres"));

                p.setDni(rs.getString("dni"));

                p.setDireccion(rs.getString("direccion"));

                p.setTel(rs.getString("telefono"));

                p.setEspecialidad(rs.getString("especialidad"));

            }

        } catch (Exception e) {

        }
        return p;

    }

    //  agregar o guardar registro ----------------------
    public boolean agregar(Veterinario per) {

        String sql = "insert into Veterinario (nombres,dni,direccion,telefono,especialidad) values(?,?,?,?,?)";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, per.getNom());

            ps.setString(2, per.getDni());

            ps.setString(3, per.getDireccion());

            ps.setString(4, per.getTel());

            ps.setString(5, per.getEspecialidad());

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

    public boolean editar(Veterinario per) {

        String sql = "update Veterinario set  nombres=?,dni=?,direccion=?,telefono=?,especialidad=?  where cod_Veterinario=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, per.getNom());

            ps.setString(2, per.getDni());

            ps.setString(3, per.getDireccion());

            ps.setString(4, per.getTel());

            ps.setString(5, per.getEspecialidad());

            ps.setInt(6, per.getId());

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

    public boolean eliminar(int id) {

        String sql = "delete from veterinario where cod_veterinario=" + id;

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

}
