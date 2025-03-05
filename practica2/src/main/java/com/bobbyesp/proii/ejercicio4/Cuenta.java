/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio4;

/**
 *
 * @author Docente
 */
public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("Saldo debe ser mayor que 0");
        }
    }

    public double ingresar(double dinero) {

        saldo = saldo + dinero;

        return saldo;

    }

    public double retirar(double dinero) {
        if ((saldo - dinero) < 0) {
            throw new IllegalArgumentException("Cantidad no disponible, el maximo a retirar es: " + saldo);
        }
        saldo = saldo - dinero;
        return saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("titular=").append(titular);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
    
}
