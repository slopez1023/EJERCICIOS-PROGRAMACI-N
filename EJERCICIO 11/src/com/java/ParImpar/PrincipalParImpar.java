package com.java.ParImpar;

import java.util.Scanner;
public class PrincipalParImpar {
    public static void main(String[] args) {
        ParImpar parImpar = new ParImpar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número: ");
        parImpar.setNum(scanner.nextInt());
    }
}
