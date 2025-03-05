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
        Cuenta miCuenta = new Cuenta("Pablo", 2000);
        
        miCuenta.ingresar(1000);
        System.out.println(miCuenta);
        
        miCuenta.retirar(4000);
        System.out.println(miCuenta);
        
    }
}
