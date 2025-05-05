package com.bobbyesp.proii.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(10);

        lista.anadir("uno");
        lista.anadir("dos");
        lista.anadir("tres");

        System.out.println("Elemento en la posición 1: " + lista.obtener(1));

        System.out.println("¿Hay algún elemento con longitud mayor a 3? " + lista.existe(s -> s.length() > 3));

        Lista<String> listaFiltrada = lista.soloLosQue(s -> s.length() > 3);
        System.out.println("Elementos filtrados:");
        listaFiltrada.paraCada(System.out::println);

        lista.eliminar(1);
        System.out.println("Lista después de eliminar el elemento en la posición 1:");
        lista.paraCada(System.out::println);
    }
}
