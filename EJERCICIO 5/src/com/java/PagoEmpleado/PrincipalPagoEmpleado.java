package com.java.PagoEmpleado;

public class PrincipalPagoEmpleado {
    public static void main(String[] args) {
        PagoEmpleado pagoEmpleado = new PagoEmpleado();
        pagoEmpleado.codEmpleado = 24569;
        pagoEmpleado.setNumeroHoras(86);
        pagoEmpleado.horasExtras = 4;
        pagoEmpleado.setSalarioBasico(1000000);
        pagoEmpleado.setDescuentoPrestamo(2000000);

        System.out.println("Horas extras: " + pagoEmpleado.calcularValorHE());
        System.out.println("El devengado tiene un valor de : " + pagoEmpleado.calcularDevengado());
        System.out.println("El deducido tiene un valor de : " + pagoEmpleado.calcularDeducido());
        System.out.println("El neto de su pago como empleado es de: " + pagoEmpleado.calcularNeto());
    }
}
