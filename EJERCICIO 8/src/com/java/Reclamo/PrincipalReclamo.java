package com.java.Reclamo;

public class PrincipalReclamo {
    public static void main(String[] args) {
        Reclamo reclamo = new Reclamo();
        reclamo.numeroReclamo = 7048;
        reclamo.setNombrePersona("Santiago");
        reclamo.setAsunto("Envío defectuoso");
        reclamo.descripcionReclamo = "El envío me llegó en pésimas condiciones";
        reclamo.setEstadoReclamo("En verificación");

        System.out.println(reclamo.descripcionReclamo);
        System.out.println(reclamo.mensajeRecepcionReclamo());

    }
}
