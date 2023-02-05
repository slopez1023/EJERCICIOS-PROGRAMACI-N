package com.java.PositivoNegativo;

import java.util.Scanner;
public class PrincipalPositivoNegativo {
    public static void main(String[] args) {
        PositivoNegativo positivoNegativo = new PositivoNegativo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número cualquiera");
        positivoNegativo.setNumeroAzar(scanner.nextByte());

        System.out.println(positivoNegativo.Numero());
    }
}
