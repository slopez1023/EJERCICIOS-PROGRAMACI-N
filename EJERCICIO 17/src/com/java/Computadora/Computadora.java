package com.java.Computadora;

public class Computadora {
    public int numeroPitidos;
    public boolean Disco;

    public String Resolucion(){
        if(numeroPitidos ==1 && Disco == true){
            return "Póngase en contacto con el técnico apoyo";
        } else if (numeroPitidos == 1 && Disco == false) {
            return "Verificar contactos de la unidad";
        } else if (numeroPitidos == 0 && Disco == false) {
            return "Traiga la computadora para repararla en la central";
        }else{
            return "Compruebe las conexiones de los altavoces";
        }
    }
}
