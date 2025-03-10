/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.ejercicio1;

import com.bobbyesp.proii.ejercicio7.Entrada;

import static com.bobbyesp.proii.ejercicio1.Libro.leerLibro;

/**
 * @author Docente
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        final int MAXIMO = 10;
        Libro[] biblioteca = new Libro[MAXIMO];
        int pos = 0;

        if (pos < MAXIMO) {
            biblioteca[pos++] = leerLibro();
        }

        for (int i = 0; i < pos; i++) {
            System.out.println(biblioteca[i]);
        }
    }

}
