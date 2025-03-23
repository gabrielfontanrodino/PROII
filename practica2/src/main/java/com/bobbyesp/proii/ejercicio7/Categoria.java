/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.bobbyesp.proii.ejercicio7;

import com.bobbyesp.proii.ejercicio1.Entrada;

/**
 * @author Docente
 */
public enum Categoria {
    //benjamín, alevín, infantil, cadete, juvenil y senior
    BENJAMIN(7, 9), ALEVIN(10, 11), INFANTIL(12, 13), CADETE(14, 15), JUVENIL(16, 18), SENIOR(19, Integer.MAX_VALUE);

    private final int min;
    private final int max;

    Categoria(int minimo, int maximo) {
        min = minimo;
        max = maximo;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static Categoria getCategoria(int edad) {
        for (Categoria c : Categoria.values()) {
            if (edad >= c.getMin() && edad <= c.getMax()) return c;
        }
        return null;
    }

    public static Categoria leerCategoria() {
        int opt;
        do {
            for (int i = 0; i < Categoria.values().length; i++) {
                String categoryName = Categoria.values()[i].toString();
                categoryName = categoryName.charAt(0) + categoryName.substring(1).toLowerCase();
                System.out.println((i + 1) + ": " + categoryName);
            }
            opt = Entrada.leerEntero("Opcion: ");
        } while (opt < 1 || opt > Categoria.values().length);
        return Categoria.values()[opt - 1];
    }

    public boolean esValidaEdad(int edad) {
        return edad <= this.getMax() && edad >= this.getMin();
    }

}