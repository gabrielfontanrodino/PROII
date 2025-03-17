/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.bobbyesp.proii.ejercicio7;

/**
 * @author Docente
 */
public enum Categoria {
    //benjamín, alevín, infantil, cadete, juvenil y senior
    BENJAMIN(7, 9),
    ALEVIN(10, 11),
    INFANTIL(12, 13),
    CADETE(14, 15),
    JUVENIL(16, 18),
    SENIOR(19, Integer.MAX_VALUE);

    private final int min;
    private final int max;

    private Categoria(int minimo, int maximo) {
        min = minimo;
        max = maximo;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static Categoria getCategoria(int edad){
        for(Categoria c: Categoria.values()){
            if(edad >= c.getMin() && edad <= c.getMax())
                return c;
        }
        return null;
    }

    public boolean esValidaEdad(int edad){
        return edad <= this.getMax() && edad >= this.getMin();
    }

}