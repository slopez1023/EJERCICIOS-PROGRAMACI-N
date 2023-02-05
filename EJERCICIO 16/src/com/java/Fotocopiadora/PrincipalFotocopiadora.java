package com.java.Fotocopiadora;

import java.util.Scanner;
public class PrincipalFotocopiadora {
    public static void main(String[] args) {
        Fotocopiadora fotocopiadora = new Fotocopiadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la cantidad de copias que desea realizar");
        fotocopiadora.setCantCopias(scanner.nextInt());
        fotocopiadora.Total();
        fotocopiadora.numTotal();
        System.out.println(fotocopiadora.resultado());

    }
}
