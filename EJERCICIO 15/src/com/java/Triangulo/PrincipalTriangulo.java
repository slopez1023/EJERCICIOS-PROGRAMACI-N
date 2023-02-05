package com.java.Triangulo;

import java.util.Scanner;
public class PrincipalTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca tres números");
        triangulo.setNumero1(scanner.nextInt());
        triangulo.setNumero2(scanner.nextInt());
        triangulo.setNumero3(scanner.nextInt());
        triangulo.sumar();
        System.out.println(triangulo.Angulo());

    }
}
