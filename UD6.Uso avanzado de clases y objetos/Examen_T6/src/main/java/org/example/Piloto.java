package org.example;

import java.util.Scanner;

public class Piloto extends Participante{
    static Scanner sc = new Scanner(System.in);
    private String marca;
    private EstadoCoche estado;
    private int puntuacion;


    public Piloto(String marca) {
        System.out.println("Introduce el nombre: ");
         String nombre = sc.nextLine();
        System.out.println("introduce el pais");
        String pais = sc.nextLine();
        setNombre(nombre);
        setPais(pais);

        this.marca = marca;
        this.estado = EstadoCoche.PENDIENTE;
        this.puntuacion = 0;

        System.out.println("El piloto "+getNombre()+" de la marca " +getMarca()+ " creado ");
    }

    public  Inscripcion inscribirse() {
        return new Inscripcion(this);
    }

    public void pagarInscripcion(Inscripcion inscripcion) {

    }

    public void setEstado(EstadoCoche estado) {
        this.estado = estado;
    }

    public EstadoCoche getEstado() {
        return estado;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "marca='" + marca + '\'' +
                ", estado=" + estado +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
