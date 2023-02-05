package com.java.Computadora;

import java.util.Scanner;
public class PrincipalComputadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        Scanner scanner = new Scanner(System.in);
        computadora.Disco = false;
        computadora.numeroPitidos = 0;
        System.out.println(computadora.Resolucion());
    }
}
