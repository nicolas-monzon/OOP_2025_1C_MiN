package org.example.error;

public final class LegajoOutOfRangeException extends RuntimeException {

    private static final String ERROR_MESSAGE = "El legajo esta fuera de rango";

    public LegajoOutOfRangeException() {
        super(ERROR_MESSAGE);
    }

}
