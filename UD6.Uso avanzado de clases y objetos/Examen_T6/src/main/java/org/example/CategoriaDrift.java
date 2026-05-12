package org.example;

public enum CategoriaDrift {
    STREET(50.0),
    PRO(150.0),
    HYPER_DRIFT(300.0);

    private double potencia;

    CategoriaDrift(double potencia){
        this.potencia = potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "CategoriaDrift{" +
                "potencia=" + potencia +
                '}';
    }
}
