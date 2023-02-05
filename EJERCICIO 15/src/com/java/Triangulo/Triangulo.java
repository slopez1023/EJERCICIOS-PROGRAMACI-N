package com.java.Triangulo;

public class Triangulo {
    public int numero1;
    public int numero2;
    public int numero3;
    public int suma;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    public void sumar(){
        suma = numero1 + numero2 + numero3;
    }
    public String Angulo(){
        if (suma == 180){
            return "El triángulo es válido";
        }else {
            return "No es válido";
        }
    }
}
