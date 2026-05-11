package org.example;

public class Acompañante extends MutxamelFC{
    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, String parentesco, Jugador integrante) {
        super(nombre, edad);
        this.parentesco = parentesco;
        this.integrante = integrante;
    }

    public void animarEquipo() {
        System.out.println(getNombre()+" que es padre de "+integrante.getNombre()+"esta animando al equipo");
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void concetrarse() {
    System.out.println("el aacompañante acompaña a "+integrante.getNombre());
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre()+" viaja con el jugador llamado" +integrante.getNombre()+" de la categoria "+integrante.getCategoria());
    }

    @Override
    public void celebrargol() {
        System.out.println("el acompañante "+getNombre()+" esta celebando un gol");
    }
}
