package org.example;

public class DepositoMaximoException extends Exception {
    public DepositoMaximoException() {
        super("no se puede ingresar mas de 3000€");
    }
}
