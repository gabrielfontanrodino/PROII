/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.ejercicio3;

/**
 *
 * @author Docente
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        // Caso de prueba: DNI válido
        try {
            Persona personaValida = new Persona("Juan", "Pérez", 12345678);
            System.out.println("Persona válida creada: " + personaValida);
            System.out.println("Letra del DNI: " + personaValida.calcularLetraDni());
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear persona válida: " + e.getMessage());
        }

        // Caso de prueba: DNI inválido (menos de 8 dígitos)
        try {
            Persona personaInvalida = new Persona("Ana", "García", 1234567); // 7 dígitos
            System.out.println("Persona creada: " + personaInvalida);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear persona con DNI incorrecto: " + e.getMessage());
        }

        // Caso de prueba: DNI inválido (más de 8 dígitos)
        try {
            Persona personaInvalida2 = new Persona("Luis", "López", 123456789); // 9 dígitos
            System.out.println("Persona creada: " + personaInvalida2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear persona con DNI incorrecto: " + e.getMessage());
        }
    }
}
