package org.example;

import java.util.Scanner;

public class Mecanico extends Participante{
    private Piloto piloto;
Scanner sc = new Scanner(System.in);
    public Mecanico(Piloto piloto){
        super();
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        setNombre(nombre);
        System.out.println("pais: ");
        String pais = sc.nextLine();
        setPais(pais);
        this.piloto = piloto;
        System.out.println("mecanico "+getNombre()+" asignado al piloto "+piloto.getNombre());

    }
    public void revisarVehiculo(){
        piloto.setEstado(EstadoCoche.REVISADO);
        System.out.println("mecanico"+getNombre()+"revisando vehiculo de "+piloto.getNombre());
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }


    @Override
    public String toString() {
        return "Mecanico{" +
                "piloto=" + piloto +
                '}';
    }
}
