package com.bobbyesp.proii.ejercicio3;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Docente
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

class OperadorFichero {

    private File fichero;

    public OperadorFichero(File fichero) {
        if (!fichero.exists()){
            throw new IllegalArgumentException("Fichero no disponible");
        }
        this.fichero = fichero;
    }

    public String leerFichero() throws IOException {
        return new String(Files.readAllBytes(this.fichero.toPath()));
    }

    public void appendTexto(String texto) throws IOException {
        Files.write(this.fichero.toPath(), texto.getBytes(), StandardOpenOption.APPEND);
    }
}

