package Pistas_Tennis;

public class ExcepcionPistareservada extends Exception {
    public ExcepcionPistareservada() {
        super("Tienes una pista reservada a la misma hora");
    }
}
