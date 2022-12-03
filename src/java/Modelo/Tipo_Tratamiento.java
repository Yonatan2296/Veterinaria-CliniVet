/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Tipo_Tratamiento {

    int id;
    String nombre;
    String precio;
    String codveterinario;

    public Tipo_Tratamiento() {

    }

    public Tipo_Tratamiento(int id, String nombre, String precio, String codveterinario) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.codveterinario = codveterinario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodveterinario() {
        return codveterinario;
    }

    public void setCodveterinario(String codveterinario) {
        this.codveterinario = codveterinario;
    }

}
