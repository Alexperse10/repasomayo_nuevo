package Ejercicio_funcionario;

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
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", tipo=" + tipo +
                '}';
    }
}
