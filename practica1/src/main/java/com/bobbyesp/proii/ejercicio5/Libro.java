/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bobbyesp.proii.ejercicio5;

/**
 * @author Docente
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

    public Libro(String titulo, String autores, String editorial, int ano, int isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.ano = ano;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo = ").append(titulo);
        sb.append("\nAutores = ").append(autores);
        sb.append("\nEditorial = ").append(editorial);
        sb.append("\nAño = ").append(ano);
        sb.append("\nISBN = ").append(isbn);
        return sb.toString();
    }


}
