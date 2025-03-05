/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio7;

/**
 *
 * @author Docente
 */
public class Club {
    private int pos;
    private Deportista[] deportistas;

    public Club(int numDeportistas) {
        this.deportistas = new Deportista[numDeportistas];
        pos = 0;
    }

    public Club() {
        this(20);
    }

    public int getMax() {
        return this.deportistas.length;
    }

    public int getNumDeportistas() {
        return this.pos;
    }

    public boolean isFull() {
        return getNumDeportistas() == getMax();
    }

    public void insertarDeportista(Deportista deportista) {
        if (isFull()) {
            throw new IllegalArgumentException("El club no admite más jugadores");
        }
        this.deportistas[pos] = deportista;
        pos++;
    }

    public Deportista getDeportista(int posicion) {
        if (posicion < 0 || posicion >= pos) {
            throw new IllegalArgumentException("Posición incorrecta: " + posicion);
        }
        return deportistas[posicion];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Club:");
        for (int i = 0; i < getNumDeportistas(); i++) {
            sb.append("\n\t").append(getDeportista(i));
            sb.append("\n\t=============");
        }
        return sb.toString();
    }
}

