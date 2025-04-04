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
        if (!esValidoDni(dni)) {
            throw new IllegalArgumentException("Dni inválido");
        }
        this.dni = dni;
        this.nombre = nombre;
        this.cat = cat;
        this.edad = comprobarEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        try {
            this.edad = comprobarEdad(edad);
        } catch (IllegalArgumentException e) {
            this.edad = edad;
            this.cat = Categoria.getCategoria(edad);
            System.out.println("Cambio de categoría detectado. Nueva: " + this.cat);
        }
    }

    private int comprobarEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("Edad inválida: " + edad + ". La edad debe ser mayor que 0.");
        }
        if (edad < cat.getMin() || edad > cat.getMax()) {
            throw new IllegalArgumentException("La edad no se corresponde con la categoría");
        }
        return edad;
    }

    private Categoria comprobarCategoria(Categoria cat) {
        if (cat == null) {
            throw new IllegalArgumentException("La categoría no puede ser nula");
        }
        if (!cat.esValidaEdad(this.edad)) {
            throw new IllegalArgumentException("La edad del deportista no coincide con su nueva categoría.");
        }

        return cat;
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Categoria getCat() {
        return this.cat;
    }

    public void setCat(Categoria cat) {
        try {
            this.cat = comprobarCategoria(cat);
        } catch (IllegalArgumentException e) {
            //Esto va a realizar el cambio automáticamente.
            //Habría que ver en el examen si se quiere/puede hacer esto.
            this.cat = Categoria.getCategoria(cat.getMin());
            this.edad = comprobarEdad(cat.getMin());
        }
    }

    public static boolean esValidoDni(String dni) {
        if (dni == null || dni.trim().length() != 9) {
            return false;
        }
        try {
            int num = Integer.parseInt(dni.substring(0, 8));
            char letra = dni.charAt(8);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letraCorrecta = letras.charAt(num % 23);
            return letraCorrecta == letra;
        } catch (NumberFormatException e) {
            return false;
        }
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
