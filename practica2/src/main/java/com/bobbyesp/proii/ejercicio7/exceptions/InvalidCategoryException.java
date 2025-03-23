package com.bobbyesp.proii.ejercicio7.exceptions;

public class InvalidCategoryException extends IllegalArgumentException {
    public InvalidCategoryException(String message) {
        super(message);
    }

    public InvalidCategoryException() {
        super("La edad del deportista no coincide con la categoría seleccionada.");
    }
}
