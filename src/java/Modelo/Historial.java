/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Historial {

    int id;
    String codmascota;
    String mascota;
    String hora;
    String estado;

    String nombremascota;
    String fechanacimiento;
    String peso;
    String sexo;

    String diagnostico;
    String codtratamiento;
    String cliente;
    String receta;
    String codigo;
    String fecha;
    String especie;

    public Historial() {

    }

    public Historial(int id, String codmascota, String mascota, String hora, String estado, String nombremascota, String fechanacimiento, String peso, String sexo, String diagnostico, String codtratamiento, String cliente, String receta, String codigo, String fecha, String especie) {
        this.id = id;
        this.codmascota = codmascota;
        this.mascota = mascota;
        this.hora = hora;
        this.estado = estado;
        this.nombremascota = nombremascota;
        this.fechanacimiento = fechanacimiento;
        this.peso = peso;
        this.sexo = sexo;
        this.diagnostico = diagnostico;
        this.codtratamiento = codtratamiento;
        this.cliente = cliente;
        this.receta = receta;
        this.codigo = codigo;
        this.fecha = fecha;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getCodtratamiento() {
        return codtratamiento;
    }

    public void setCodtratamiento(String codtratamiento) {
        this.codtratamiento = codtratamiento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
