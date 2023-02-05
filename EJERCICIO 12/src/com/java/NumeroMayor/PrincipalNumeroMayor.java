package com.java.NumeroMayor;

import java.util.Scanner;
public class PrincipalNumeroMayor {
    public static void main(String[] args) {
        NumeroMayor numeroMayor = new NumeroMayor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres números");
        numeroMayor.setNumero1(scanner.nextInt());
        numeroMayor.setNumero2(scanner.nextInt());
        numeroMayor.setNumero3(scanner.nextInt());
        System.out.println("El número mayor es: " + numeroMayor.resultado());
    }
}
