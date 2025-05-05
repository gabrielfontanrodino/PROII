package com.bobbyesp.proii.ejercicio1;

/**
 * @author Docente
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Reunion reunion;

        reunion = new Reunion("Prueba", "UVigo", 2025, 3, 31, 12, 0);
        //Reasignación
        reunion = new Reunion("Segunda reunion", "UVigo", 2026, 6, 22, 15, 30);

        System.out.println(reunion);
    }
}
