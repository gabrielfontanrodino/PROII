package com.bobbyesp.proii.ejercicio7.club;

import com.bobbyesp.proii.ejercicio7.Categoria;
import com.bobbyesp.proii.ejercicio7.Deportista;
import com.bobbyesp.proii.ejercicio7.exceptions.EmptyClubException;

public interface IClub {
    int getMax();

    int getNumDeportistas();

    boolean isFull();

    boolean isEmpty();

    int indiceDe(Deportista deportista) throws EmptyClubException;

    void insertarDeportista(Deportista deportista);

    void eliminarDeportista(int posicion) throws EmptyClubException;

    void eliminarDeportista(String dni) throws EmptyClubException;

    Deportista getDeportista(int posicion);

    Deportista getDeportista(String dni);

    boolean existeDeportista(Deportista deportista);

    void mostrarListaDeportistas() throws EmptyClubException;
    void mostrarListaDeportistas(Categoria categoria) throws EmptyClubException;

    double generarMediaDeEdades() throws EmptyClubException;
}