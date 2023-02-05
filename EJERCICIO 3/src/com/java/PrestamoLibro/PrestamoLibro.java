package com.java.PrestamoLibro;

public class PrestamoLibro {
    public int codPrestamo;
    public String fechaPrestamo;
    public String nombreLibro;
    public int codigoUsuario;
    public byte diasDePrestamo;
    public String EstadoPrestamo;

    public String consultarestadoPrestamo(){
        if(EstadoPrestamo.equals("Activo")){
            return "El préstamo se encuentra activo";
        }else{
            return "El préstamo se encuentra inactivo";
        }
    }
    public String consultarDatosPrestamo(){
        if(EstadoPrestamo.equals("Activo")){
            return "Código de su préstamo: "+ codPrestamo + "Fecha: " + fechaPrestamo + "Libro: " + nombreLibro + "Código de usuario: " + codigoUsuario + "Días de su préstamo" + diasDePrestamo;
        }else{
            return "Usuario Inactivo";
        }
    }
}
