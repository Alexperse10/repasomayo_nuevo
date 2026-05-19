package Pistas_Tennis;

public abstract class Pistas {
    private Tipo tipo;
    private String identificador;
    int contador =1;

    public Pistas(Tipo tipo) {
        this.tipo = tipo;
        this.identificador = generaridentificador();
        contador++;
    }

    public String generaridentificador (){
        String valor;
        if (contador<10){
             valor = "raquetas00";
            System.out.println(valor+contador);
        } else if (contador<100) {
             valor = "raquetas0";
            System.out.println(valor+contador);
        }else {
             valor = "raquetas"+contador;
        }

return valor;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getContador() {
        return contador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Pistas{" +
                "tipo=" + tipo +
                ", identificador='" + identificador + '\'' +
                ", contador=" + contador +
                '}';
    }
}
