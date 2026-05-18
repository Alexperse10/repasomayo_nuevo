package Ejercicio2_recaudacioncine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CineAPP {
    static Random aleatorio = new Random();
    static int numero_personas = aleatorio.nextInt(250);
   static Queue<Persona> colapersona = new LinkedList<>();

  static   public void generarCola(){
        int contador_edad1 =0;
        int contador_edad2 = 0;
        int contador_edad3 =0;
        for (int i =0; i<numero_personas; i++){
            colapersona.add(new Persona());
        }
        System.out.println("hay "+numero_personas+" "+colapersona);
        for (Persona persona : colapersona) {
            if (persona.getEdad()>=3 && persona.getEdad()<=10){
                contador_edad1++;

            }else if (persona.getEdad()>=11 && persona.getEdad()<=17) {
                contador_edad2++;
            }else {
                contador_edad3++;
            }
        }

        int resultado_1 = contador_edad1*1;
        double resultado_2 = contador_edad2*2.5;
        double resultado_3 = contador_edad3*3.5;
        double resultado_total = resultado_1+resultado_2+resultado_3;
        System.out.println("el dinero total recaudado es "+resultado_total);


    }
    public static void main(String[] args) {
        System.out.println(" *** CINE AL POBLE ***");
        generarCola();
    }
}
