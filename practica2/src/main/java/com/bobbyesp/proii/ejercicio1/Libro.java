/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio1;

/**
 * @author BobbyESP y Carlabbis
 */
public class Libro {

    /*
    La información para manejar libros está formada por su título, autores, editorial, año de edición e isbn.  Para visualizar un libro se hace como en este ejemplo:
    Titulo = Thinking in Java
    Autores = Bruce Eckel
    Editorial = Prentice Hall
    Año = 2007
    Isbn = 0131872486
     */
    private String titulo;
    private String autores;
    private String editorial;
    private int ano;
    private int isbn;
    private TipoLibro tipoLibro;

    public Libro(String titulo, String autores, String editorial, int ano, int isbn, TipoLibro tipoLibro) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        assertAno(ano);
        this.ano = ano;
        this.isbn = isbn;
        this.tipoLibro = tipoLibro;
    }

    public void setAno(int ano) {
        assertAno(ano);
        this.ano = ano;
    }

    private void assertAno(int ano) {
        if (ano < 2000) {
            throw new IllegalArgumentException("El libro es anterior al 2000.");
        }
    }

    public static Libro leerLibro() {
        String titulo;
        String autores;
        String editorial;
        int ano;
        int isbn;
        TipoLibro tipoLibro;

        titulo = Entrada.leerCadena("Introduce el titulo: ");
        autores = Entrada.leerCadena("Introduce los autores: ");
        editorial = Entrada.leerCadena("Introduce la editorial: ");
        ano = Entrada.leerEntero("Introduce el año de publicacion: ");
        isbn = Entrada.leerEntero("Introduce el ISBN: ");
        tipoLibro = TipoLibro.leerTipoLibro();

        return new Libro(titulo, autores, editorial, ano, isbn, tipoLibro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo = ").append(titulo);
        sb.append("\nAutores = ").append(autores);
        sb.append("\nEditorial = ").append(editorial);
        sb.append("\nAño = ").append(ano);
        sb.append("\nISBN = ").append(isbn);
        sb.append("\nTipo de Libro = ").append(tipoLibro.toString());
        return sb.toString();
    }

}
