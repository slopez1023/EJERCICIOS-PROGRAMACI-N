package com.java.PagoEmpleado;

public class PagoEmpleado {
    public int codEmpleado;
    private int SalarioBasico;
    public int horasExtras;
    private int numeroHoras;
    private int descuento;
    private int descuentoPrestamo;
    private int bonificacion;
    private int Neto;

    public int calcularValorHE(){
        return horasExtras = SalarioBasico * 2;
    }
    public int calcularDevengado(){
        return bonificacion = horasExtras * numeroHoras;
    }
    public int calcularDeducido(){
        return descuento = descuentoPrestamo;
    }
    public int calcularNeto(){
       return Neto = ((SalarioBasico + horasExtras)*numeroHoras)-descuento;
    }

    public int getSalarioBasico() {
        return SalarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        SalarioBasico = salarioBasico;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(int descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getNeto() {
        return Neto;
    }

    public void setNeto(int neto) {
        Neto = neto;
    }
}
