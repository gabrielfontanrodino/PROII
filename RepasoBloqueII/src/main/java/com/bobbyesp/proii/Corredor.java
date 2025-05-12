/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii;

/**
 *
 * @author Docente
 */
public class Corredor extends Deportista{
    private double longitudZancada;

    public Corredor(double longitudZancada, String dni, String nombre, String categoria, int edad) {
        super(dni, nombre, categoria, edad);
        this.longitudZancada = longitudZancada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Corredor:\n");
        sb.append(super.toString());
        sb.append("longitudZancada=").append(longitudZancada);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int getRepeticionesMarca(int pos) {
        Marca marca = this.getMarca(pos);
        return (int) (marca.getDistancia()/longitudZancada);
        
        

    }
    
    
}
