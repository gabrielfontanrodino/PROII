/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.bobbyesp.proii.ejercicio7;

/**
 *
 * @author Docente
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Deportista d1 = new Deportista(5, "Hola", Categoria.ALEVIN);

        Club c1 = new Club(4);
        c1.insertarDeportista(d1);
        c1.insertarDeportista(new Deportista(7, "aaaa", Categoria.JUVENIL));
        c1.insertarDeportista(new Deportista(9, "bbbb", Categoria.SENIOR));
        anhadirDeportista(c1);
        anhadirDeportista(c1);
        System.out.println(c1);
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
        
        dni = input.leerEntero("Dame le DNI: ");
        nombre = input.leerCadenas("Dame el nombre: ");
        cat = getCategoria();
        
        return new Deportista(dni, nombre, cat);
        
    }
    public static void  anhadirDeportista(Club club){
        if (club.isFull()) System.out.println("El club está lleno, no admite mas deportistas");
        else{
            club.insertarDeportista(leerDeportista());
        }
        
    }
}
