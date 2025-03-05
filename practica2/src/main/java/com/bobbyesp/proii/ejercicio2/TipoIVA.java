package com.bobbyesp.proii.ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Docente
 */
public enum TipoIVA {
    GENERAL(0.21),
    REDUCIDO(0.1),
    SUPERREDUCIDO(0.04),
    EXENTO(0.0);
    
    private final double  porcentaje;

    private TipoIVA(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    public double calcularPrecioFinal(double precio){
        return precio + precio * porcentaje;
    }
    
    
}
