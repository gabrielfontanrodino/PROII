package com.bobbyesp.proii.ejercicio7.exceptions;

public class EmptyClubException extends RuntimeException {
    public EmptyClubException(String message) {
        super(message);
    }

    public EmptyClubException() {
        super("Esta acción no se puede ejecutar. El club está vacío.");
    }
}
