package org.example;

import java.util.Random;
import java.util.Scanner;

public class Juez extends Participante implements AccionesCarrera{
    Scanner sc = new Scanner(System.in);
    public Juez() {
        super();
        System.out.println("nombre: ");
        String nombre = sc.nextLine();
        setNombre(nombre);
        System.out.println("Pais");
        String pais = sc.nextLine();
        setPais(pais);
        System.out.println("El juez "+getNombre()+" se ha creado con exito");
    }

    public void validarCocheapto(Piloto piloto) throws CambioEstadoExcepcion {
        if (piloto.getEstado().equals(EstadoCoche.REVISADO)) {
            piloto.setEstado(EstadoCoche.APTO);
        }else {
            piloto.setEstado(EstadoCoche.NO_APTO);
        }
        throw new CambioEstadoExcepcion();

    }


    @Override
    public void validarInscripciones(Inscripcion inscripcion) {
        System.out.println("Validando inscripciones...");
        if (inscripcion.getPagado()) {
            System.out.println("Piloto: "+inscripcion.getPiloto().getNombre()+" Incripcion valida");
        }else {
            System.out.println("La inscripcion no esta completada por el piloto"+inscripcion.getPiloto().getNombre());
            inscripcion.getPiloto().setMarca("NO_valido");
        }
    }

    @Override
    public void darSalida() {
        System.out.println("el juez "+getNombre()+ " da la salida a la carrera en 3...2 ....1...");
    }

    @Override
    public void puntuar(Piloto piloto) {
        if (piloto.getEstado().equals(EstadoCoche.APTO)) {
            Random aleatorio = new Random();
            int puntuacion_ = aleatorio.nextInt(10)+1;
            piloto.setPuntuacion(puntuacion_);
        }
    }
}
