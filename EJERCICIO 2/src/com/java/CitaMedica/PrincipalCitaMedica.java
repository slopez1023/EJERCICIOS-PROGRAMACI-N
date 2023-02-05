package com.java.CitaMedica;

public class PrincipalCitaMedica {
    public static void main(String[] args) {
        CitaMedica citaMedica = new CitaMedica();
        citaMedica.nombrePaciente = "Santiago";
        citaMedica.codCita = 1004870;
        citaMedica.Consultorio = "107B";
        citaMedica.nombreMedico = "Diana";
        citaMedica.fecha = "2/2/2023";
        citaMedica.hora = 10;
        citaMedica.setCentroMedico("Milagro de Dios");

        System.out.println("Cita generada: " + citaMedica.crearCita());
        System.out.println("Datos: " + citaMedica.consultarDatosCita());

        citaMedica.cambiarHora();
        System.out.println("Hora modificada: " + citaMedica.consultarDatosCita());

    }
}
