package org.example;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {

        super("no se puede retirar mas de los que se dispone");
    }
}
