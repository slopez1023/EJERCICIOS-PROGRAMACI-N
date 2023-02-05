package com.java.Fotocopiadora;

public class Fotocopiadora {
    public int cantCopias;
    public int precio;
    public int Total;
    public int numTotal;

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
    public void operacion (){
        if(cantCopias <= 499){
            precio = 120;
        } else if ((cantCopias >= 500)&&(cantCopias<=749)) {
            precio = 100;
        } else if ((cantCopias>=750)&&(cantCopias<=999)) {
            precio = 80;
        }
    }
    public void Total(){
        numTotal = cantCopias * precio;
    }
    public String resultado(){
        return "Precio por cada copia hecha: " + precio + "Precio total de ls copias hechas: " + numTotal;
    }

    public void numTotal() {
        this.numTotal = numTotal;
    }
}
