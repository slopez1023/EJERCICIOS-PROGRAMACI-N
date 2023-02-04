package com.java;

public class PrincipalUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario ();
        usuario.validarEstado("Contraseña");
        System.out.println("Bienvenido" + usuario.permitirAcceso());
    }
}
