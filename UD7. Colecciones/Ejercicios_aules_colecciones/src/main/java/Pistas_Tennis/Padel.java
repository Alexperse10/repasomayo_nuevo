package Pistas_Tennis;

public class Padel extends Pistas{
    private Paredes paredes;

    public Padel(Tipo tipo, Paredes paredes) {
        super(tipo);
        this.paredes = paredes;
    }

    public Paredes getParedes() {
        return paredes;
    }

    public void setParedes(Paredes paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Padel{" +
                "paredes=" + paredes +
                '}';
    }
}
