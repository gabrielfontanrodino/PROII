/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio5;

/**
 *
 * @author Docente
 */
public class Calculadora {
    public static void main(String[] args) {
        Operacion operacion;
        operacion = Operacion.SUMA;
        
        System.out.println(operacion.mostrarResultado(40, 50));
    }
}
