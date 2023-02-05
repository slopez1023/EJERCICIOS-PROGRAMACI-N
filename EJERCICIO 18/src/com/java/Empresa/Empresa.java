package com.java.Empresa;

public class Empresa {
    public int numeroCarro;

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }
    public String resultado(){
        if(numeroCarro == 119 || numeroCarro == 179 || numeroCarro == 189 || numeroCarro == 195 || numeroCarro == 221 || numeroCarro == 780){
            return "El vehículo se encuentra defectuoso, llevar a garantía";
        }else {
            return "Su vehículo no está defectuoso, está en óptimas condiciones";
        }
    }
}
