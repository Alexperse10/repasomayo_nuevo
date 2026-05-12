package org.example;

public class Mecanico extends Participante{
    private Piloto piloto;

    public Mecanico(Piloto piloto, String nombre, String pais){
        super();
        this.piloto = piloto;
    }
    public void revisarVehiculo(){

    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "piloto=" + piloto +
                '}';
    }
}
