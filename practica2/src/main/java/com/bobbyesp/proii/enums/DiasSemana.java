package com.bobbyesp.proii.enums;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Docente
 */
public enum DiasSemana {
    LUNES(1,true),
    MARTES(2,true),
    MIERCOLES(3,true),
    JUEVES(4,true),
    VIERNES(5,true),
    SABADO(6,false),
    DOMINGO(7,false);

    private final int posicion;
    private final boolean laborable;

    private DiasSemana(int posicion, boolean laborable) {
        this.posicion = posicion;
        this.laborable = laborable;
    }

    public boolean esLaborable() {
        return laborable;
    }
    
    public int energiaTotal(int numero){
        return numero - posicion;
    }

    public int getPosicion() {
        return posicion;
    }
    
    
    @Override
    public String toString() {
       return Character.toString(name().charAt(0)) + name().substring(1).toLowerCase() ;
    }
    
    
    
}
