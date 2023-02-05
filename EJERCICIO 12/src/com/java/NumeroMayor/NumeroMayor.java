package com.java.NumeroMayor;

public class NumeroMayor {
    public int numero1;
    public int numero2;
    public int numero3;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    public String resultado(){
        if(numero1>numero3 && numero1>numero2){
            return "El número mayor es: " + numero1;
        } else if (numero2>numero1 && numero2>numero3) {
            return "El número mayor es: " + numero2;
        }else if (numero3>numero1 && numero3>numero2){
            return "El número mayor es: " + numero3;
        }else {
            return null;
        }
    }
}
