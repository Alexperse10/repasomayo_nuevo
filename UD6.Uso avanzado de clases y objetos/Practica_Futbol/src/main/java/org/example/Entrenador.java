package org.example;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionpreferida;
    public Entrenador(String nombre, int edad, Equipos equipo, String formacionpreferida) throws FormacionPreferida {
        super(nombre, edad);
        setFormacionpreferida(formacionpreferida);
        this.equipo = equipo;
    }


    public void planificarentreno () {
System.out.println("Entrenador del equipo "+equipo+" preparando entreno");
    }

    public void hacercambios() {
    System.out.println("el entrenador "+getNombre()+" esta haciendo cambios");
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public void setFormacionpreferida(String formacionpreferida) throws FormacionPreferida {
        if (!formacionpreferida.matches("\\d+-\\d+-\\d+")){
           throw new FormacionPreferida();
        }else {
            this.formacionpreferida = formacionpreferida;
        }

    }

    public Equipos getEquipo() {
        return equipo;
    }

    public String getFormacionpreferida() {
        return formacionpreferida;
    }



    @Override
    public void concetrarse() {
        System.out.println("el entrenador "+getNombre()+" se concentra con su equipo "+equipo);
    }

    @Override
    public void viajar(String ciudad) {
    System.out.println("el equipo "+equipo+ "viaja a otra ciudad");
    }

    @Override
    public void celebrargol() {
        System.out.println("el entrenador celebra un gol");
    }

    @Override
    public void entrenar() {
        System.out.println("el entrenador esta entrenado a su equipo de categoria "+equipo);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("juegan el partido contra el rival "+rival);
    }
}
