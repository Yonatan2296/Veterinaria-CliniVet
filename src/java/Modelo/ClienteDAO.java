/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cliente;
import ConexionMySql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    Conexion cn = new Conexion();

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    Cliente p = new Cliente();

    public List<Cliente> buscar(String dato) {

        ArrayList<Cliente> list = new ArrayList<>();

        String sql = "SELECT * from cliente where nombres like'%" + dato + "%'";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Cliente per = new Cliente();

                per.setId(rs.getInt("cod_cliente"));

                per.setNom(rs.getString("nombres"));

                per.setDni(rs.getString("dni"));

                per.setDireccion(rs.getString("direccion"));
                per.setTel(rs.getString("telefono"));

                per.setEmail(rs.getString("email"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }

    public List listar() {

        ArrayList<Cliente> list = new ArrayList<>();

        String sql = "select  * from  cliente";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Cliente per = new Cliente();

                per.setId(rs.getInt("cod_cliente"));

                per.setNom(rs.getString("nombres"));

                per.setDni(rs.getString("dni"));

                per.setDireccion(rs.getString("direccion"));
                per.setTel(rs.getString("telefono"));

                per.setEmail(rs.getString("email"));

                list.add(per);
            }

        } catch (Exception e) {

        }

        return list;

    }

    // enviar registro al otro navegador
    public Cliente enviar(int id) {

        String sql = "select  * from  cliente  where cod_cliente=" + id;

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                p.setId(rs.getInt("cod_cliente"));

                p.setNom(rs.getString("nombres"));

                p.setDni(rs.getString("dni"));

                p.setDireccion(rs.getString("direccion"));

                p.setTel(rs.getString("telefono"));
                p.setEmail(rs.getString("email"));

            }

        } catch (Exception e) {

        }
        return p;

    }

    //  agregar o guardar registro ----------------------
    public boolean agregar(Cliente per) {

        int res = 0;
        String sql = "insert into cliente(nombres,dni,direccion,telefono,email) values(?,?,?,?,?)";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, per.getNom());

            ps.setString(2, per.getDni());

            ps.setString(3, per.getDireccion());

            ps.setString(4, per.getTel());

            ps.setString(5, per.getEmail());

            res = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public boolean editar(Cliente per) {

        String sql = "update cliente set  nombres=?,dni=?,direccion=?,telefono=?,email=? where cod_cliente=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, per.getNom());
            ps.setString(2, per.getDni());
            ps.setString(3, per.getDireccion());
            ps.setString(4, per.getTel());
            ps.setString(5, per.getEmail());

            ps.setInt(6, per.getId());

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

    public boolean eliminar(int id) {

        String sql = "delete from cliente  where cod_cliente=" + id;

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;

    }

}
