package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DriftSpainSeriesApp {
   public static ArrayList<Inscripcion> pilotosInscritos = new ArrayList<>();

    public static void verGanador(CategoriaDrift categoria) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ===== BIENVENIDO A LA APP DEL DRIFT SPAIN SERIES DE VALENCIA ====");
        Piloto skoda = new Piloto("skoda");
        Piloto mercedes = new Piloto("mercedes");
        Piloto toyota = new Piloto("toyota");

        Inscripcion skoda_insc = skoda.inscribirse();

    }
}
