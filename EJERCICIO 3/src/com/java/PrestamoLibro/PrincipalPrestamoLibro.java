package com.java.PrestamoLibro;

public class PrincipalPrestamoLibro {
    public static void main(String[] args) {
        PrestamoLibro prestamoLibro = new PrestamoLibro();
        prestamoLibro.nombreLibro = "Lord of the Rings";
        prestamoLibro.fechaPrestamo = "2/2/2023";
        prestamoLibro.diasDePrestamo = 15;
        prestamoLibro.codPrestamo = 18399;
        prestamoLibro.codigoUsuario = 24585;
        prestamoLibro.EstadoPrestamo = "Activo";

        System.out.println("Estado de usuario: " + prestamoLibro.EstadoPrestamo);
        System.out.println("Datos de su préstamo: " + prestamoLibro.consultarDatosPrestamo());

    }
}
