package com.bobbyesp.proii.ejercicio7.club;

import com.bobbyesp.proii.ejercicio7.Categoria;
import com.bobbyesp.proii.ejercicio7.Deportista;
import com.bobbyesp.proii.ejercicio7.exceptions.EmptyClubException;

public class Club implements IClub {
    private int pos;
    private final Deportista[] deportistas;

    public Club(int numDeportistas) {
        this.deportistas = new Deportista[numDeportistas];
        pos = 0;
    }

    public Club() {
        this(20);
    }

    @Override
    public int getMax() {
        return this.deportistas.length;
    }

    @Override
    public int getNumDeportistas() {
        return this.pos;
    }

    @Override
    public boolean isFull() {
        return getNumDeportistas() == getMax();
    }

    @Override
    public boolean isEmpty() {
        return this.pos == 0;
    }

    @Override
    public int indiceDe(Deportista deportista) throws EmptyClubException {
        assertNotEmpty();

        for (int i = 0; i < getNumDeportistas(); i++) {
            if (deportistas[i].equals(deportista)) {
                return i;
            }
        }

        throw new RuntimeException("El deportista no existe en el club");
    }

    @Override
    public void insertarDeportista(Deportista deportista) {
        if (isFull()) {
            throw new IllegalArgumentException("El club no admite más jugadores");
        }

        if (existeDeportista(deportista)) {
            throw new IllegalArgumentException("El deportista ya existe en la lista");
        }

        this.deportistas[pos] = deportista;
        pos++;
    }

    @Override
    public void eliminarDeportista(int posicion) throws EmptyClubException {
        assertNotEmpty();

        if (posicion < 0 || posicion >= getNumDeportistas()) {
            throw new IllegalArgumentException("Posición incorrecta: " + posicion);
        }
        for (int i = posicion; i < getNumDeportistas() - 1; i++) {
            deportistas[i] = deportistas[i + 1];
        }
        pos--;
    }

    @Override
    public void eliminarDeportista(String dni) throws EmptyClubException {
        assertNotEmpty();

        int posicion = indiceDe(getDeportista(dni));

        for (int i = posicion; i < getNumDeportistas() - 1; i++) {
            deportistas[i] = deportistas[i + 1];
        }

        pos--;
    }

    @Override
    public Deportista getDeportista(int posicion) throws EmptyClubException {
        if (posicion < 0 || posicion >= getNumDeportistas()) {
            throw new IllegalArgumentException("Posición incorrecta: " + posicion);
        }
        return deportistas[posicion];
    }

    @Override
    public Deportista getDeportista(String dni) {

        for (int i = 0; i < getNumDeportistas(); i++) {
            if (deportistas[i].getDni().equals(dni)) {
                return deportistas[i];
            }
        }
        return null;
    }

    @Override
    public boolean existeDeportista(Deportista deportista) {
        String dni = deportista.getDni();

        return getDeportista(dni) != null;
    }

    @Override
    public void mostrarListaDeportistas() throws EmptyClubException {
        assertNotEmpty();

        System.out.println("\n");
        System.out.println("====== Lista de deportistas ======");
        for (int i = 0; i < getNumDeportistas(); i++) {
            System.out.println(i + 1 + ". " + deportistas[i].getNombre());
        }
        System.out.println("==================================");
        System.out.println("\n");
    }

    @Override
    public void mostrarListaDeportistas(Categoria categoria) throws EmptyClubException {
        assertNotEmpty();

        System.out.println("\n");
        System.out.println("====== Lista de deportistas" +  " - " + categoria.toString() + " ======");
        for (int i = 0; i < getNumDeportistas(); i++) {
            if(categoria.equals(deportistas[i].getCat())) {
                System.out.println(i + 1 + ". " + deportistas[i].getNombre());
            }
        }
        System.out.println("=======================================");
        System.out.println("\n");

    }

    @Override
    public double generarMediaDeEdades() throws EmptyClubException {
        assertNotEmpty();

        double sum = 0.0;

        for(int i = 0; i < getNumDeportistas(); i++) {
            sum += deportistas[i].getEdad();
        }

        return sum / getNumDeportistas();
    }

    private void assertNotEmpty() {
        if (isEmpty()) {
            throw new EmptyClubException();
        }
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