package com.java.Alcaldia;

import java.util.Scanner;
public class PrincipalAlcaldia {
    public static void main(String[] args) {
        Alcaldia alcaldia = new Alcaldia();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su género");
        alcaldia.setGenero(scanner.next());
        System.out.println("Introduzca su edad");
        alcaldia.setEdad(scanner.nextInt());
        System.out.println(alcaldia.resultado());
    }
}
