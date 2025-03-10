/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.bobbyesp.proii.ejercicio5;

/**
 * @author Docente
 */
public enum Operacion {
    SUMA('+'),
    RESTA('-'),
    MULTIPLICACION('*'),
    DIVISION('/');

    private final char operador;

    private Operacion(char simbolo) {
        this.operador = simbolo;
    }

    public double operar(int numero1, int numero2) {
        int resultado = 0;
        switch (this) {
            case SUMA -> {
                resultado = numero1 + numero2;
            }
            case RESTA -> {
                resultado = numero1 - numero2;
            }
            case MULTIPLICACION -> {
                resultado = numero1 * numero2;
            }
            case DIVISION -> {
                if (numero2 == 0) {
                    throw new IllegalArgumentException("El divisor no puede ser 0");
                }
                resultado = numero1 / numero2;
            }
        }
        return resultado;
    }

    public String mostrarResultado(int numero1, int numero2) {
        StringBuilder sb = new StringBuilder();

        sb.append(numero1)
                .append(" ")
                .append(Character.toString(operador))
                .append(" ")
                .append(numero2)
                .append(" = ")
                .append(Double.toString(operar(numero1, numero2)));

        return sb.toString();

    }
}
