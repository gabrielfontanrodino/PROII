/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.ejercicio4;

/**
 *
 * @author Docente
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Prueba de creación de cuenta con saldo negativo
        try {
            Cuenta cuentaError = new Cuenta("María José", -100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear cuenta: " + e.getMessage());
        }

        // Creación de una cuenta con datos correctos
        Cuenta cuenta = new Cuenta("Juan Pérez", 1000);
        System.out.println("Cuenta creada: " + cuenta);

        // Prueba de ingreso correcto
        try {
            double nuevoSaldo = cuenta.ingresar(500);
            System.out.println("Nuevo saldo tras ingresar 500: " + nuevoSaldo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al ingresar dinero: " + e.getMessage());
        }

        // Prueba de retiro correcto
        try {
            double nuevoSaldo = cuenta.retirar(300);
            System.out.println("Nuevo saldo tras retirar 300: " + nuevoSaldo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al retirar dinero: " + e.getMessage());
        }

        // Prueba de intento de retirar más dinero del disponible
        try {
            double nuevoSaldo = cuenta.retirar(1500);
            System.out.println("Nuevo saldo tras retirar 1500: " + nuevoSaldo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al retirar dinero: " + e.getMessage());
        }

        // Prueba de ingresar cantidad negativa
        try {
            double nuevoSaldo = cuenta.ingresar(-50);
            System.out.println("Nuevo saldo tras ingresar -50: " + nuevoSaldo);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al ingresar dinero: " + e.getMessage());
        }
    }
}
