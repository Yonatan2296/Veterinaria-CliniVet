/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author Yonatan
 */
public class RolConfig {

    public static String NomRol(String cargo){
        if(cargo.equals("1")){
            return "Administrador";
        }else if(cargo.equals("2")){
            return "Usuario";
        }
        return "Desconocido";
    }
}
