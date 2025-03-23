/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio7;

/**
 * @author Docente
 */
public class Deportista {
    private String dni;
    private String nombre;
    private Categoria cat;
    private int edad; // nuevo atributo

    public Deportista(String dni, String nombre, Categoria cat, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.cat = cat;
        this.edad = comprobarEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = comprobarEdad(edad);
        //Comprobar categoría
        Categoria nuevaCat = Categoria.getCategoria(edad);
        if(this.cat != nuevaCat) {
            this.cat = nuevaCat;
            System.out.println("Cambio de categoría detectado. Nueva: " + this.cat);
        }
    }

    private int comprobarEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("Edad inválida: " + edad + ". La edad debe ser mayor que 0.");
        }

        if (edad < cat.getMin() || edad > cat.getMax())
            throw new IllegalArgumentException("La edad no se corresponde con la categoría");

        return edad;
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public static boolean esValidoDni(String dni) {
        boolean toret;
        char letra;
        int num;
        String cad;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (dni.trim().length() != 9) {
            toret = true;
        } else {
            try {
                cad = dni.substring(0, 8);
                num = Integer.parseInt(cad);
                letra = dni.charAt(8);
                toret = letras.charAt(num % 23) == letra;
            } catch (NumberFormatException e) {
                toret = false;
            }
        }

        return toret;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deportista: ");
        sb.append("\nDNI:  ").append(dni);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nCategoria: ").append(cat);
        sb.append("\nEdad: ").append(edad);
        return sb.toString();
    }
}
