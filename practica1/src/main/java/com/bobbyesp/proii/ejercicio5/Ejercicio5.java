/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.bobbyesp.proii.ejercicio5;

import java.util.Scanner;

/**
 * @author Docente
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Libro libro;

        String titulo;
        String autores;
        String editorial;
        int ano;
        int isbn;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Titulo: ");
        titulo = entrada.nextLine();
        System.out.print("Autores: ");
        autores = entrada.nextLine();
        System.out.print("Editorial: ");
        editorial = entrada.nextLine();
        System.out.print("Año: ");
        ano = Integer.parseInt(entrada.nextLine());
        System.out.print("ISBN: ");
        isbn = Integer.parseInt(entrada.nextLine());

        libro = new Libro(titulo, autores, editorial, ano, isbn);

        System.out.println(libro.toString());
    }
}
