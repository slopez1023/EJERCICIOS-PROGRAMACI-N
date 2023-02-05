package com.java.PositivoNegativo;

public class PositivoNegativo {
    public byte numeroAzar;

    public void setNumeroAzar(byte numeroAzar) {
        this.numeroAzar = numeroAzar;
    }
    public String Numero(){
        if(numeroAzar > 0){
            return "El número es: " + numeroAzar + "positivo";
        }else{
            return "Es negativo";
        }
    }
}
