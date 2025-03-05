/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bobbyesp.proii.ejercicio1;

/**
 *
 * @author Docente
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Libro [] biblioteca;
        final int MAXIMO = 10;
        int pos=0;
        
        int numero;
        
        biblioteca = new Libro[MAXIMO];
       
        if (pos < biblioteca.length) {
            biblioteca[pos] = leerLibro();
            ++pos;
        }
        
        for (int i = 0; i < pos; i++) {
            System.out.println(biblioteca[i]);
            
            
        }
        
       
        
        
       
    }
    
    public static Libro leerLibro (){
        Entrada scan = new Entrada();
        String titulo;
        String autores;
        String editorial;
        int ano;
        int isbn;
        TipoLibro tipoLibro;

        System.out.println("NUEVO LIBRO");
        titulo = scan.leerCadenas("Introduce título: ");
        autores = scan.leerCadenas("Introduce autores: ");
        editorial = scan.leerCadenas("Introduce editorial: ");
        ano = scan.leerEntero("Introduce año: ");
        isbn = scan.leerEntero("Introduce ISBN: ");
        tipoLibro = leerTipoLibro();
        

        return new Libro(titulo, autores, editorial, ano, isbn,tipoLibro);
        
    }


public static TipoLibro leerTipoLibro(){
    int opcion;
    Entrada entrada = new Entrada();

    System.out.println("Introduzca el tipo de libro");
    do{
        for (int i = 0; i < TipoLibro.values().length; i++) {
            System.out.println((TipoLibro.values()[i].ordinal()+1)+ ".- " + TipoLibro.values()[i].toString());
        }
        opcion = entrada.leerEntero("Seleccione una opción: ");
        

    }while(opcion<1 || opcion > TipoLibro.values().length);
    
    return TipoLibro.values()[(opcion-1)];
}

}
