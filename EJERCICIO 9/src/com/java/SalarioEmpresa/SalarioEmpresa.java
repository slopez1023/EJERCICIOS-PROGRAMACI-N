package com.java.SalarioEmpresa;

public class SalarioEmpresa {
    public String nombreEmpleado;
    public int numeroHoras;
    public int salario;

    public void setNombreEmpleado(String next){
        this.nombreEmpleado = next;
    }
    public void setNumeroHoras(int next){
        this.numeroHoras = next;
    }
    public void calcularSalario(){
        if(numeroHoras<10){
            salario = 30000;
        }else{
            salario = 33000;
        }
    }
    public int salarioEntero(){
        return salario * numeroHoras;
    }
}
