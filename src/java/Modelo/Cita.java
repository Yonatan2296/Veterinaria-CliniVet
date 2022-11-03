/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Cita {
    
     int id;
     String fecha;
     String hora;
     String codcliente;
     String nombres;
     
     String codmascota;
     String mascota;
     String especie;
     String estado;

     public Cita(){
         
         
     }

    public Cita(int id, String fecha, String hora, String codcliente, String nombres, String codmascota, String mascota, String especie, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.codcliente = codcliente;
        this.nombres = nombres;
        this.codmascota = codmascota;
        this.mascota = mascota;
        this.especie = especie;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCodmascota() {
        return codmascota;
    }

    public void setCodmascota(String codmascota) {
        this.codmascota = codmascota;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
     
     
   
}
