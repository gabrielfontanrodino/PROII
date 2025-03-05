/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.ejercicio1;

/**
 *
 * @author Docente
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Punto p1 = new Punto(4,5);
       Punto p2 = new Punto(3,65);
       System.out.println(p1.getX());
       
        System.out.println("Distancia al origen de " + p1 + " es: " + p1.calculaDistanciaOrigen());
       System.out.println(p1);
       System.out.println(p2);
    }
}
