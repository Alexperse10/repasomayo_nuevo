package org.example;

public class LimiteDiarioException extends Exception {
    public LimiteDiarioException() {
        super("No se puede retirar mas de 600€");
    }
}
