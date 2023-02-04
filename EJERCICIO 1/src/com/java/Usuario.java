package com.java;

public class Usuario {
    public String UsuarioBase;
    public String UsuarioIngresado;
    public String claveBase;
    public String claveIngresada;
    public String EstadoSistema;

    public String validarEstado(String claveIngresada){
        return this.claveIngresada = claveIngresada;
    }

    public String permitirAcceso (){
        if (claveIngresada.equals("Contraseña")){
            return "Acceso permitido";
        }else{
            return "Acceso denegado";
        }
    }
}
