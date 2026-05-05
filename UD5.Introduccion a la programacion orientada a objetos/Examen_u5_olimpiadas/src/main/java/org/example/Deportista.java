package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Deportista {
    private String nombre;
    private LocalDate fecha_nacimiento;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listamodalidades;

    public Deportista(String nombre, LocalDate fecha_nacimiento){
        this.nombre = nombre;
        this.fecha_nacimiento= fecha_nacimiento;
        this.medallas =0;
        this.equipo = new Equipo("");
        this.listamodalidades = new ArrayList<>();


    }

    public void inscribirse(String modalidad) {
        listamodalidades.add(modalidad);
    }

    public void vermodalidades() {
        for (String modalidad : listamodalidades){
            System.out.println(modalidad);
        }
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public ArrayList<String> getListamodalidades() {
        return listamodalidades;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setListamodalidades(ArrayList<String> listamodalidades) {
        this.listamodalidades = listamodalidades;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", medallas=" + medallas +
                ", equipo=" + equipo +
                ", listamodalidades=" + listamodalidades +
                '}';
    }
}
