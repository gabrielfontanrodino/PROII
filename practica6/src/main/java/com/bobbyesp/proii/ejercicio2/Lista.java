package com.bobbyesp.proii.ejercicio2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lista<T> {

    private T[] elementos;
    private int numElementos = 0;

    public Lista(int tamanoMaximo) {
        this.elementos = (T[]) new Object[tamanoMaximo];
    }

    public void anadir(T elem) {
        if (this.numElementos == elementos.length) {
            throw new IllegalArgumentException("Lista llena");
        }
        this.elementos[numElementos++] = elem;
    }

    public T obtener(int pos) {
        validarPosicion(pos);

        return this.elementos[pos];
    }

    public boolean existe(Predicate<T> predicado) {
        for(int i = 0; i < this.numElementos; i++) {
            if (predicado.test(obtener(i))) {
                return true;
            }
        }
        return false;
    }

    public Lista<T> soloLosQue(Predicate<T> predicate) {
        Lista<T> listaFiltrada = new Lista<>(this.elementos.length);
        for(int i = 0; i < this.numElementos; i++) {
            T elemento = this.elementos[i];
            if (predicate.test(elemento)) {
                listaFiltrada.anadir(elemento);
            }
        }
        return listaFiltrada;
    }

    public void paraCada(Consumer<T> consumer) {
        for (int i = 0; i < this.numElementos; i++) {
            consumer.accept(obtener(i));
        }
    }

    public void eliminar(int pos) {
        validarPosicion(pos);

        for (int i = pos; i < this.numElementos - 1; i++) {
            this.elementos[i] = obtener(i+1);
        }
        this.numElementos--;
    }

    public <R> Lista<R> transformar(Function<T, R> function) {
        Lista<R> listaTransformada = new Lista<>(this.elementos.length);
        for(int i = 0; i < this.numElementos; i++) {
            listaTransformada.anadir(function.apply(obtener(i)));
        }
        return listaTransformada;
    }

    private void validarPosicion(int pos) throws IllegalArgumentException {
        if (pos < 0 || pos >= this.numElementos) {
            throw new IllegalArgumentException("eliminar: posicion no valida: " + pos);
        }
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("[");
        for (int i = 0; i < this.numElementos; i++) {
            if (i > 0) {
                toString.append(", ");
            }
            toString.append(this.elementos[i].toString());
        }
        toString.append("]");
        return toString.toString();
    }

}