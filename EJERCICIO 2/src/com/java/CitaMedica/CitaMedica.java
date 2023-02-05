package com.java.CitaMedica;

public class CitaMedica {
    public int codCita;
    public String fecha;
    public int hora;
    public String Consultorio;
    public String nombreMedico;
    public String nombrePaciente;
    private String centroMedico;

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }
    public String crearCita(){
        return "Paciente" + nombrePaciente + "con número" + codCita + "En unos momentos podrá pasar al consultorio" + Consultorio + "Y lo atenderá" + nombreMedico + "para el día" + fecha + "a las" + hora;
    }
    public String consultarDatosCita(){
        return "Nombre: " + nombrePaciente + "Código: " + codCita + "Consultorio: " + Consultorio + "Médico: " + nombreMedico + "Fecha: " + fecha + "Hora: " + hora;
    }
    public int cambiarHora(){
        return hora = 15;
    }
}
