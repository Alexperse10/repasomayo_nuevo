package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DriftSpainSeriesApp {
   public static ArrayList<Inscripcion> pilotosInscritos = new ArrayList<>();
   public static ArrayList<Mecanico> listamecanicos = new ArrayList<>();

    public static void verGanador(CategoriaDrift categoria) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ===== BIENVENIDO A LA APP DEL DRIFT SPAIN SERIES DE VALENCIA ====");
        Piloto skoda = new Piloto("skoda");
//        Piloto mercedes = new Piloto("mercedes");
//        Piloto toyota = new Piloto("toyota");

        Inscripcion skoda_insc = skoda.inscribirse();
        pilotosInscritos.add(skoda_insc);
        Juez juez1 = new Juez();

        skoda.pagarInscripcion(skoda_insc);

        for (Inscripcion inscripcion_ : pilotosInscritos) {
            System.out.println(inscripcion_);
        }

        for (Inscripcion inscripcion : pilotosInscritos) {
            if (!inscripcion.getPiloto().getMarca().equalsIgnoreCase("NO_VALIDO")){
                listamecanicos.add(new Mecanico(skoda));

            }
        }
        for (Mecanico mecanico : listamecanicos) {
            mecanico.revisarVehiculo();
            System.out.println("Mecanico "+mecanico.getNombre()+" revisando el vehiculo "+mecanico.getPiloto().getNombre());
        }

        juez1.darSalida();

        juez1.puntuar(skoda);

        }
    }
}
