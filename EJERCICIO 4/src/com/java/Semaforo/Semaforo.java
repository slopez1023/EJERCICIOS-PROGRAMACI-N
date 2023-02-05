package com.java.Semaforo;

public class Semaforo {
    public String colorBombilla;
    public String encendidoApagado;

    public String cambiarColor(){
        if(colorBombilla == ("Amarillo")){
            return this.colorBombilla = "Verde";
        }
        return null;
    }
    public String apagarSemaforo(){
        if (encendidoApagado == ("Off")){
            return "Apagado";
        }else{
            return "Encendido";
        }
    }
    public String encenderSemaforo(){
        if (encendidoApagado == ("On")){
            return "Encendido";
        }else{
            return "Apagado";
        }
    }
    public String mostrarMensajeAlConductor(){
        if (colorBombilla == ("Verde")){
            return "Puede seguir: " + colorBombilla;
        } else if (colorBombilla == ("Rojo")) {
            return "Deténgase: " + colorBombilla;
        }else {
            return null;
        }
    }

}
