package com.bobbyesp.proii;

import java.util.ArrayList;
import java.util.List;

public abstract class Deportista {
    private final String dni;
    private final String nombre;
    private String categoria;
    private int edad;
    private final List<Marca> marcas;

    /**
     * crea un deportista, asignando su dni, nombre, categoría y edad
     *
     * @param dni,       el DNI como String
     * @param nombre,    el nombre como String
     * @param categoria, la categoria como un enumerado Categoria
     * @param edad,      la edad como un int
     */
    public Deportista(String dni, String nombre, String categoria, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        setCategoria(categoria);
        setEdad(edad);
        marcas = new ArrayList<>();
    }

    public void validarPosicionMarca(int pos) {
        if (pos < 0 || pos > marcas.size()) throw new IllegalArgumentException("No existe esa marca");


    }

    public abstract int getRepeticionesMarca(int pos);

    public Marca getMarca(int pos) {
        validarPosicionMarca(pos);
        return marcas.get(pos);
    }


    public void añadirMarca(Marca m) {
        if (m == null) throw new IllegalArgumentException("Marca incorrecta ");
        marcas.add(m);
    }

    /**
     * Devuelve el dni del deportista
     *
     * @return el dni como String
     */
    public String getDni() {
        return dni;
    }

    /**
     * Devuelve el nombre del deportista
     *
     * @return el nombre como String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la categoría del deportista
     *
     * @return la categoría como enum Categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Modifica la categoría de un deportista
     *
     * @param categoria
     */
    public final void setCategoria(String categoria) {
        if (categoria == null || categoria.isEmpty()) throw new IllegalArgumentException("Categoría incorrecta");
        this.categoria = categoria;
    }

    /**
     * Devuelve la edad del deportista
     *
     * @return la edad como int
     */
    public int getEdad() {
        return edad;
    }

    /**
     * modifica la edad de un deportista, comprobando que esta en rango
     *
     * @param edad
     */
    public final void setEdad(int edad) {
        // completar
        if (edad < 0) throw new IllegalArgumentException("Edad incorrecta (negativa)");
        this.edad = edad;
    }

    /**
     * Devuelve la información de un deportista como un String
     *
     * @return String
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nNombre: ").append(getNombre());
        sb.append("\nDNI: ").append(getDni());
        sb.append("\nEdad: ").append(getEdad()).append(" años");
        sb.append("\nCategoría: ").append(getCategoria().toLowerCase());
        marcas.forEach(m -> sb.append("\n\t").append(m));

        return sb.toString();
    }
}
