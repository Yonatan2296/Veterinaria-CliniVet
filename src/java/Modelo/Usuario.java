/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Usuario {

     int id;

  String usuario;
  String contra;
   int cargo;
    String cargos;
    
   public  Usuario(){
       
       
       
   }

    public Usuario(int id, String usuario, String contra, int cargo, String cargos) {
        this.id = id;
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
        this.cargos = cargos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }
    
  
 
    
 
    
}
