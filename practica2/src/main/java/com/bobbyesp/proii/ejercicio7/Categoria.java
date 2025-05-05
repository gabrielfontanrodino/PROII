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

    /**
     * Gets the minimum age for the category.
     *
     * @return the minimum age
     */
    public int getMin() {
        return min;
    }

    /**
     * Gets the maximum age for the category.
     *
     * @return the maximum age
     */
    public int getMax() {
        return max;
    }

    /**
     * Determines the category based on age.
     *
     * @param edad the age to check
     * @return the corresponding category or null if no match is found
     */
    public static Categoria getCategoria(int edad) {
        for (Categoria c : Categoria.values()) {
            if (edad >= c.getMin() && edad <= c.getMax()) return c;
        }
        return null;
    }

    /**
     * Reads and returns a category based on user input.
     *
     * @return the selected category
     */
    public static Categoria leerCategoria() {
        int opt;
        Categoria[] categorias = Categoria.values();
        do {
            for (int i = 0; i < categorias.length; i++) {
                String categoryName = categorias[i].toString();
                categoryName = categoryName.charAt(0) + categoryName.substring(1).toLowerCase();
                System.out.println((i + 1) + ": " + categoryName);
            }
            opt = Entrada.leerEntero("Opcion: ");
        } while (opt < 1 || opt > categorias.length);
        return categorias[opt - 1];
    }

    /**
     * Checks if the given age is valid for the category.
     *
     * @param edad the age to check
     * @return true if the age is valid, false otherwise
     */
    public boolean esValidaEdad(int edad) {
        return edad <= this.getMax() && edad >= this.getMin();
    }

    @Override
    public String toString() {
        String categoryName = name().charAt(0) + name().substring(1).toLowerCase();
        return categoryName;
    }

}
