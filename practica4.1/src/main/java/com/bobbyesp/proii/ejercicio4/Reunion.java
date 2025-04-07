/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Docente
 */
public class Reunion {

    private static final int MAX_ASISTENTES = 10;
    private String asunto;
    private String lugar;
    private final Fecha fecha;
    private final Hora hora;
    private List<Asistente> asistentes;

    private Asistente secretario;

    public Reunion(String asunto, String lugar, Fecha fecha, Hora hora, Asistente secretario, int numAsistentes) {
        if (secretario == null) {
            throw new IllegalArgumentException("Todas las reuniones deben tener secretario");
        }
        this.asunto = asunto;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.secretario = secretario;

        asistentes = new ArrayList<>(numAsistentes);
        agregarAsistente(secretario);
    }

    public int getNumAsistentes() {
        return asistentes.size();
    }

    public int getMaxAsistentes() {
        return Integer.MAX_VALUE;
    }

    public Asistente getAsistentePosicion(int pos) {
        if (pos < 0 || pos >= getNumAsistentes()) {
            throw new IllegalArgumentException("Posicion incorrecta ");
        }
        return asistentes.get(pos);
    }

    public void agregarAsistente(Asistente asistente) {
        if (asistente == null) {
            throw new IllegalArgumentException("Asistente no existe ");
        }
        if (existeAsistente(asistente)) {
            throw new IllegalArgumentException("El Asistente ya esta incluido ");
        }
        if (isFull()) {
            throw new IllegalArgumentException("Esta lleno");
        }

        if (asistentes.size() < getMaxAsistentes()) {
            asistentes.add(asistente);
        } else {
            throw new IllegalArgumentException("No se puede agregar el asistente ");
        }
    }

    public void eliminarAsistente(int pos) {
        if (pos < 0 || pos >= getNumAsistentes()) {
            throw new IllegalArgumentException("Posicion incorrecta ");
        }
        if (getAsistentePosicion(pos) == secretario) {
            throw new IllegalArgumentException("No se puede eliminar al secretario ");
        }

        asistentes.remove(pos);

    }

    public boolean isFull() {
        return getNumAsistentes() == getMaxAsistentes();
    }

    public void cambiarSecretario(Asistente nuevoSecretario) {
        int pos = getPosicionAsistente(nuevoSecretario);

        if (nuevoSecretario == null) throw new IllegalArgumentException("El secretario debe ser válido");
        if (pos == -1 && !isFull()) {
            agregarAsistente(nuevoSecretario);
        } else if (isFull()) {
            throw new IllegalArgumentException("Está lleno de asistentes y el nuevo secretario no asiste a la reunion.");
        }

        secretario = nuevoSecretario;


    }

    public int getPosicionAsistente(Asistente asistente) {
        boolean encontrado = false;
        int pos = 0;
        while (pos < getNumAsistentes() && !encontrado) {
            if (asistente.equals(getAsistentePosicion(pos))) {
                encontrado = true;
            } else ++pos;
        }
        if (!encontrado) pos = -1;

        return pos;
    }

    public boolean existeAsistente(Asistente asistente) {
        boolean encontrado = false;
        int pos = 0;
        while (pos < getNumAsistentes() && !encontrado) {
            if (asistente.equals(getAsistentePosicion(pos))) {
                encontrado = true;
            }
            ++pos;
        }

        return encontrado;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" == Reunion == ");
        sb.append("\nAsunto: ").append(asunto);
        sb.append("\nLugar: ").append(lugar);
        sb.append("\nFecha: ").append(fecha);
        sb.append("\nHora: ").append(hora);
        sb.append("\n===============");
        return sb.toString();
    }


}
