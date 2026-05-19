package Pistas_Tennis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PistaAPP {
    Scanner sc = new Scanner(System.in);
   static ArrayList<Reservas> listareservas__ = new ArrayList<>();
   static Map<Usuarios, ArrayList<Reservas>> listareserva = new HashMap<>();

   static void realizarreserva (Usuarios usuario,Reservas reservas) {
       if ()

   }

    public static void main(String[] args) {
        Usuarios usuarios1 = new Usuarios("alex",001);
        Usuarios usuario2 = new Usuarios("ramon", 002);
        Usuarios usuasrio3 = new Usuarios("francisco", 003);
        Usuarios usuarios4 = new Usuarios("rafa", 004);

        Padel padel1 = new Padel(Tipo.Exterior,Paredes.Cemento);
        Padel padel2 = new Padel(Tipo.Indoor,Paredes.Cristal);
        Padel padel3 = new Padel(Tipo.Exterior, Paredes.Cristal);

        Tennis tennis1 = new Tennis(Tipo.Exterior,Superficie.Tierra_batida);
        Tennis tennis2 = new Tennis(Tipo.Indoor,Superficie.Hierba);
        Tennis tennis3 = new Tennis(Tipo.Exterior, Superficie.Cemento);

        Reservas reserva1 = new Reservas(usuarios1,padel1);
        Reservas reserva2 = new Reservas(usuario2,tennis1);
        Reservas reserva3 = new Reservas(usuasrio3,tennis2);
        Reservas reserva4 = new Reservas(usuarios1,tennis3);




    }
}
