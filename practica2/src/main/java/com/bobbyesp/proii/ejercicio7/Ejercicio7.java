/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.bobbyesp.proii.ejercicio7;

/**
 *
 * @author Docente
 */
public class Ejercicio7 {

    // Método main para probar la gestión de excepciones || Parte de la práctica 3
    public static void main(String[] args) {
        Club club = new Club(2); // Club con capacidad para 2 deportistas

        // Intentar insertar deportistas y capturar la excepción si el club está lleno
        try {
            club.insertarDeportista(new Deportista(12345678, "Juan", Categoria.ALEVIN, 25));
            club.insertarDeportista(new Deportista(23456789, "Ana", Categoria.BENJAMIN, 30));
            // Este intento lanzará excepción porque se excede la capacidad del club
            club.insertarDeportista(new Deportista(34567890, "Luis", Categoria.ALEVIN, 22));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al insertar deportista: " + e.getMessage());
        }

        // Intentar acceder a un deportista en una posición inválida
        try {
            Deportista d = club.getDeportista(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al obtener deportista: " + e.getMessage());
        }

        System.out.println(club);
    }

    public static Categoria getCategoria() {
        int opt;
        Entrada input = new Entrada();
        do {
            for (int i = 0; i < Categoria.values().length; i++) {
                System.out.println((i + 1) + ": " + Categoria.values()[i]);
            }
            opt = input.leerEntero("Opcion: ");
        } while (opt < 1 || opt > Categoria.values().length);
        return Categoria.values()[opt-1];
    }
    
    public static Deportista leerDeportista() {
        Entrada input = new Entrada();
        int dni;
        String nombre;
        Categoria cat;
        int edad;
        
        dni = input.leerEntero("Dame le DNI: ");
        nombre = input.leerCadenas("Dame el nombre: ");
        cat = getCategoria();
        edad = input.leerEntero("Dame la edad: ");
        
        return new Deportista(dni, nombre, cat, edad);
        
    }
    public static void  anhadirDeportista(Club club){
        if (club.isFull()) System.out.println("El club está lleno, no admite mas deportistas");
        else{
            club.insertarDeportista(leerDeportista());
        }
        
    }
}
