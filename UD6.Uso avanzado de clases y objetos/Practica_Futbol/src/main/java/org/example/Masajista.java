package org.example;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int añosExperiencia;

    public Masajista(String titulacion, int añosExperiencia, String nombre, int edad) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;

    }

    public void darmasaje (Jugador jugador){

    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }


    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                '}';
    }

    @Override
    public void concetrarse() {
System.out.println("el masajista esta concentrado");
    }

    @Override
    public void viajar(String ciudad) {
System.out.println("esta viajando a la ciudad de "+ciudad);
    }

    @Override
    public void celebrargol() {
        System.out.println("esta celebrando un gol");
    }
}
