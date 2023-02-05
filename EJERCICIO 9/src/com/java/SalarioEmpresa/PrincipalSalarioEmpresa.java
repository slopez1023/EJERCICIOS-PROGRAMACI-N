package com.java.SalarioEmpresa;

import java.util.Scanner;
public class PrincipalSalarioEmpresa {
    public static void main(String[] args) {
        SalarioEmpresa salarioEmpresa = new SalarioEmpresa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ponga su nombre");
        salarioEmpresa.setNombreEmpleado(scanner.next());
        System.out.println("Número de horas trabajadas");
        salarioEmpresa.setNumeroHoras(scanner.nextInt());

        salarioEmpresa.calcularSalario();
        System.out.println("Estimado/a: " + salarioEmpresa.nombreEmpleado + "El número de horas es: " + salarioEmpresa.numeroHoras + "Y su salario equivale a: " + salarioEmpresa.salario);


    }
}
