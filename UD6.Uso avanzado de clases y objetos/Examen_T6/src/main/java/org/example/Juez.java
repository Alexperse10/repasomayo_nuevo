package org.example;

import java.util.Scanner;

public class Juez extends Participante implements AccionesCarrera{
    Scanner sc = new Scanner(System.in);
    public Juez() {
        super();
        System.out.println("nombre: ");
        String nombre = sc.nextLine();
        setNombre(nombre);
        System.out.println("Pais");
        System.out.println("El juez "+getNombre()+" se ha creado con exito");
    }

    public void validarCocheapto(Piloto piloto) throws CambioEstadoExcepcion {
        throw new CambioEstadoExcepcion();

    }


    @Override
    public void validarInscripciones(Inscripcion inscripcion) {

    }

    @Override
    public void darSalida() {

    }

    @Override
    public void puntuar(Piloto piloto) {

    }
}
