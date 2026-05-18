package Ejercicio_funcionario;

import java.util.Objects;

public class Informe {
    private int codigo;
    private Descripcion tipo;

    public Informe(int codigo, Descripcion tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public void setTipo(Descripcion tipo) {
        this.tipo = tipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Descripcion getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", tipo=" + tipo +
                '}';
    }
}
