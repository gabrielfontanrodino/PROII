package com.bobbyesp.proii;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ClubDeportivo {

    private final List<Deportista> deportistas;
    private final int maximo;

    /**
     * Nuevo Club Deportivo con un número máximo de deportistas
     *
     * @param maximo el número máximo de deportistas, como entero
     */
    public ClubDeportivo(int maximo) {
        deportistas = new ArrayList<>(maximo);
        this.maximo = maximo;
        // completar
    }

    protected void validarPosicion(int pos) {
        if (pos < 0 || pos > getNumDeportistas()) {
            throw new IllegalArgumentException("posicion Incorrecta");
        }
    }

    /**
     * Devuelve el deportista de la posición pos
     *
     * @param pos la posición en el vector de deportistas
     * @return el objeto Deportista correspondiente
     */
    public Deportista getDeportista(int pos) {
        validarPosicion(pos);
        return deportistas.get(pos);
    }

    /**
     * Devuelve el número de deportistas creados
     *
     * @return el número de deportistas disponibles en el vector, como entero
     */
    public int getNumDeportistas() {
        return deportistas.size();
    }

    /**
     * Devuelve el máximo de deportistas
     *
     * @return el número de deportistas máximo, como entero
     */
    public int getMaxDeportistas() {
        return this.maximo;
    }

    /**
     * Inserta un nuevo deportista
     *
     * @param d el nuevo objeto deportista
     */
    public void insertaDeportista(Deportista d) {
        if (deportistas.size() == getMaxDeportistas()) {
            throw new IllegalArgumentException("Club lleno");
        }
        if (d == null) {
            throw new IllegalArgumentException("Deportista inválido");
        }
        deportistas.add(d);
    }

    public void filtrarDeportistas(String categoria) {
        deportistas.forEach(d -> {
            if (d.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(d);
            }

        });
    }

    public List<Deportista> filtrarDeportistas(Predicate<Deportista> criterio) {
        ArrayList<Deportista> deportistasFiltrados = new ArrayList<>();

        deportistas.forEach(d -> {
            if (criterio.test(d)) {
                deportistasFiltrados.add(d);
            }
        });
        return deportistasFiltrados;

    }

    /**
     * Devuelve la información de los deportistas del club deportivo
     *
     * @return como string
     */
    public String toString() {
        StringBuilder toret = new StringBuilder();

        if (getNumDeportistas() == 0) {
            toret.append("El club no tiene deportistas");
        } else {
            for (int i = 0; i < getNumDeportistas(); ++i) {
                toret.append("\nDeportista: ").append((i + 1));
                toret.append(getDeportista(i).toString()).append("\n");
            }
        }
        return toret.toString();
    }
}
