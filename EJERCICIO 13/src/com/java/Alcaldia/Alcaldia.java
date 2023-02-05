package com.java.Alcaldia;

public class Alcaldia {
    public String Genero;
    public int edad;

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String resultado(){
        if(Genero.equals ("Femenino")&& edad >50){
            return "Usted recibirá 120000";
        } else if (Genero.equals("Femenino")&& edad >29 && edad< 50) {
            return "Usted recibirá 100000";
        } else if (Genero.equals("Masculino")) {
            return "Usted recibirá 40000";
        }else {
            return null;
        }
    }
}
