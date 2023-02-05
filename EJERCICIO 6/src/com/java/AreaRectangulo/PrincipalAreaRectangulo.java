package com.java.AreaRectangulo;

public class PrincipalAreaRectangulo {
    public static void main(String[] args) {
        AreaRectangulo areaRectangulo = new AreaRectangulo();
        areaRectangulo.base = 27;
        areaRectangulo.altura = 15;
        System.out.println(areaRectangulo.validarDatosIngresados());
        System.out.println("El área del rectángulo es de: " + areaRectangulo.calcularArea());

    }
}
