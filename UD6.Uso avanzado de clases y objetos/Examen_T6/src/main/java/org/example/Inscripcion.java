package org.example;

public class Inscripcion {
    private Piloto piloto;
    private  CategoriaDrift categoria;
    private Boolean pagado;

    public Inscripcion(Piloto piloto, CategoriaDrift categoria, Boolean pagado){
        this.piloto = piloto;
        this.categoria = categoria;
        this.pagado = pagado;
    }

    public void setCategoria(CategoriaDrift categoria) {
        this.categoria = categoria;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public CategoriaDrift getCategoria() {
        return categoria;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "piloto=" + piloto +
                ", categoria=" + categoria +
                ", pagado=" + pagado +
                '}';
    }
}
