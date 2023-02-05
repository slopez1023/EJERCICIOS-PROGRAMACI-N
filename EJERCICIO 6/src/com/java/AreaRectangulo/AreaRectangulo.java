package com.java.AreaRectangulo;

public class AreaRectangulo {
    public int base;
    public int altura;

    public String validarDatosIngresados(){
        return "El rectángulo tiene una base de: " + base + "Y tiene una altura de: " + altura;
    }
    public int calcularArea(){
        return base * altura;
    }
}
