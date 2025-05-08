package com.bobbyesp.proii.ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio1 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        List<String> losDeTamanoMayorA3 = new ArrayList<>();

        Consumer<String> printSize = (s) -> System.out.println(s.length());

        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        //Ejercicio 1
        lista.forEach(System.out::println);
        lista.forEach(s -> System.out.println(s.length()));

        lista.forEach((value) -> {
            if (value.length() > 3) {
                losDeTamanoMayorA3.add(value);
            }
        });

        lista.forEach(printSize);
        lista.forEach(Ejercicio1::imprimir);
    }

    private static void imprimir(String value) {
        System.out.println(value);
    }
}
