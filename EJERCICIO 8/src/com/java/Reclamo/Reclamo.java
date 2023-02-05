package com.java.Reclamo;

public class Reclamo {
    public int numeroReclamo;
    private String nombrePersona;
    private String asunto;
    public String descripcionReclamo;
    private String estadoReclamo;

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = String.valueOf(estadoReclamo);
    }

    public String validarEstadoReclamo(){
        if (estadoReclamo == ("Verificando")){
            return "Su reclamo está en la fase de verificación";
        }else{
            return "Su reclamo está en la fase de espera";
        }
    }
    public String mensajeRecepcionReclamo(){
        return "Usuario: " + nombrePersona + "Con reclamo número: " + numeroReclamo + descripcionReclamo + "Su reclamo pronto será evaluado";
    }
}
