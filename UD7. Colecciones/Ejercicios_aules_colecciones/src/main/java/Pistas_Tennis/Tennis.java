package Pistas_Tennis;

public class Tennis extends Pistas{
    private Superficie superficie;

    public Tennis(Tipo tipo,Superficie superficie) {
        super(tipo);
        this.superficie = superficie;
    }

    public Superficie getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Tennis{" +
                "superficie=" + superficie +
                '}';
    }
}
