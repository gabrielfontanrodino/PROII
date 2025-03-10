/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

/**
 * @author Docente
 */
public class Punto {


    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculaDistanciaOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {

        return "(" + x + " ," + y + ")";
    }

}
