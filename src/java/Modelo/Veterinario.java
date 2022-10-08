/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Star
 */
public class Veterinario {
    
         int id;
     String dni;
     String nom;
     String Tel;
     String direccion;
   String especialidad;

   public Veterinario(){
       
       
   }

    public Veterinario(int id, String dni, String nom, String Tel, String direccion, String especialidad) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.Tel = Tel;
        this.direccion = direccion;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
   
   
   
}
