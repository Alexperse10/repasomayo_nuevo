package org.example;

public class CambioEstadoExcepcion extends Exception {
    public CambioEstadoExcepcion() {
        super("No esta revisado por lo tanto no puede ser Apto");
    }
}
