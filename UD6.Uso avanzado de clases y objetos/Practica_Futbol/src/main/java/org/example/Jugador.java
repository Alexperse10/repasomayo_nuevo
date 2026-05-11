package org.example;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    public Jugador(String nombre, int edad,Equipos categoria, Posiciones posicion, int dorsal) {
        super(nombre, edad);
        this.categoria = categoria;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public void calentar() {
    System.out.println("el jugador "+getNombre()+" esta calentando");
    }

    public void descansar() {
        System.out.println("El equipo de categoria" +categoria+" esta descansando");
    }

    public void marcargol () {
        System.out.println("el jugador de nombre "+getNombre()+" ha marcado un gol");
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    @Override
    public void concetrarse() {
    System.out.println("el jugador "+getNombre()+" esta concentrandose");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("el equipo esta viajando a otra ciudad");

    }

    @Override
    public void celebrargol() {
        System.out.println("Esta celebrando un gol");
    }

    @Override
    public void entrenar() {
        System.out.println("el juegador que juega en la posicion "+posicion+" esta entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("esta jugando un partido contra "+rival);
    }
}
