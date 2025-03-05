package com.bobbyesp.proii.ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class OperadorFichero {
    private File fichero;

    public OperadorFichero(File fichero) {
        // SEGUNDA TAREA: Verificar que el fichero existe.
        if (!fichero.exists()) {
            throw new IllegalArgumentException("El fichero no existe: " + fichero.getAbsolutePath());
        }
        this.fichero = fichero;
    }

    // PRIMERA TAREA: Se declara throws IOException para que la clase sea reutilizable
    public String readFile() throws IOException {
        return new String(Files.readAllBytes(this.fichero.toPath()));
    }

    // PRIMERA TAREA: Se declara throws IOException para que la clase sea reutilizable
    public void addText(String texto) throws IOException {
        Files.write(this.fichero.toPath(), texto.getBytes(), StandardOpenOption.APPEND);
    }
}
