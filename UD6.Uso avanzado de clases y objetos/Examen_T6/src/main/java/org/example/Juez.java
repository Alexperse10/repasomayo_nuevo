package org.example;

public class Juez extends Participante implements AccionesCarrera{
    public Juez() {
        super();

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
