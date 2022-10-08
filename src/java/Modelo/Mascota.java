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
public class Mascota {
    
     int idmascota;
     String nombre;
     String especie;
     String codcliente;
     String codraza;
     
     
     String fecha;
     String peso;
     String sexo;
     
public Mascota(){
    
    
}

    public Mascota(int idmascota, String nombre, String especie, String codcliente, String codraza, String fecha, String peso, String sexo) {
        this.idmascota = idmascota;
        this.nombre = nombre;
        this.especie = especie;
        this.codcliente = codcliente;
        this.codraza = codraza;
        this.fecha = fecha;
        this.peso = peso;
        this.sexo = sexo;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getCodraza() {
        return codraza;
    }

    public void setCodraza(String codraza) {
        this.codraza = codraza;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     
    
    
}
