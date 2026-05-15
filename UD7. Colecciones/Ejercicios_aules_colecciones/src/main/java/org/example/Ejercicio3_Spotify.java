package org.example;

import java.util.Formattable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio3_Spotify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> playlist = new LinkedList<>();
        System.out.println("introduce canciones a tu lista de reproduccion");
        for (int i =0; i<4; i++) {
            String cancion = sc.nextLine();
            playlist.offer(cancion);
        }
        System.out.println("Estado inicial de la lista "+playlist);
        while (!playlist.isEmpty()) {
            System.out.println("Reproduciendo "+playlist.poll());
            System.out.println("Estado de la lista despues de reproducir cancion: "+playlist);

        }
        System.out.println("la lista de reproduccion ha terminado");

    }
}
