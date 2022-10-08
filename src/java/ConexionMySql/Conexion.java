package ConexionMySql;

import java.sql.*;

public class Conexion {

    Connection con;

    public Conexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veterinaria", "root", "");

            System.out.println("OK");
        } catch (Exception e) {

            System.err.println("Error al Conectar" + e);
            e.printStackTrace();
        }

    }

    public Connection getConnection() {

        return con;

    }

}
