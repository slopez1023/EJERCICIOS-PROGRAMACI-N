package com.java.Empresa;

import java.util.Scanner;
public class PrincipalEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número de serie de su coche");
        empresa.setNumeroCarro(scanner.nextInt());
        System.out.println(empresa.resultado());
    }
}
