package com.bobbyesp.proii.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Fecha fecha;
        Hora hora;
        Hora hora2;
        Reunion reunion;
        fecha = new Fecha(2, 3, 2025);
        hora = new Hora(12, 0);
        reunion = new Reunion("Examen", "Uvigo", fecha, hora);
        System.out.println(reunion);
        hora2 = new Hora(14, 30);
        reunion = new Reunion("Examen", "Uvigo", fecha, hora2);
        System.out.println(reunion);
        System.out.println(hora);
        System.out.println(fecha);
    }
}
