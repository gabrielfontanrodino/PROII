/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio2;

/**
 *
 * @author Docente
 */
public class Articulo {
    private String nombre;
    private double precio;
    private TipoIVA tipo;

    public Articulo(String nombre, double precio, TipoIVA tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    public double getPrecioReal(){
        return tipo.calcularPrecioFinal(precio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Articulo{");
        sb.append("nombre=").append(nombre);
        sb.append(", precio=").append(getPrecioReal());
        sb.append('}');
        return sb.toString();
    }
    
    
}
