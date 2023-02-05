package com.java.Envio;

public class PrincipalEnvio {
    public static void main(String[] args) {
        Envio envio = new Envio ();
        envio.numeroGuia = 37659;
        envio.setFecha("02/02/2023");
        envio.setTipoEmbalaje("Primario-Plástico");
        envio.cedulaCliente = 1004870872;
        envio.setPeso(500);
        envio.setCiudadOrigen("Armenia");
        envio.setCiudadDestino("Medellín");
        envio.setCosto(450000);
        envio.setEstadoEnvio("En camino");

        System.out.println("Su envío tiene un peso de: " + envio.getPeso() + "Kg" + "Por lo que el costo del envío será de: " + envio.calcularCostoXKilo());
        System.out.println(envio.verificarEntrega());
    }
}
