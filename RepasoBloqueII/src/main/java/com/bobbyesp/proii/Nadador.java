/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii;

/**
 *
 * @author Docente
 */
public class Nadador extends Deportista{
    private double frecuenciaBrazada;

    public Nadador(double frecuenciaBrazada, String dni, String nombre, String categoria, int edad) {
        super(dni, nombre, categoria, edad);
        this.frecuenciaBrazada = frecuenciaBrazada;
    }

     @Override
    public int getRepeticionesMarca(int pos) {
        Marca marca = this.getMarca(pos);
        return (int) (marca.getTiempo()*frecuenciaBrazada);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nadador:\n");
        sb.append(super.toString());
        sb.append("frecuenciaBrazada=").append(frecuenciaBrazada);
        sb.append('}');
        return sb.toString();
    }
    
    
}
