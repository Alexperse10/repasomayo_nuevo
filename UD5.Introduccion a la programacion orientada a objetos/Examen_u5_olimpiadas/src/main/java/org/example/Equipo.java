package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Equipo {
    private String pais;
    private ArrayList<Deportista> listadeportista;

    public Equipo(String pais) {
        this.pais = pais;
        this.listadeportista = new ArrayList<Deportista>();
    }

    public void inscribirdeportistas (Deportista deportista) {
        listadeportista.add(deportista);
        deportista.setEquipo(this);
    }

    public int medallastotales() {
        int totales=0;
        for (Deportista deportista : listadeportista){

            totales += deportista.getMedallas();
        }
        return totales;
    }

    public void vermedallero(){
        for (Deportista deportistas : listadeportista) {
            if (deportistas.getMedallas() ==0){

            }else {
                System.out.println(deportistas.getNombre() + " " + deportistas.getMedallas());
            }
        }
    }

    public Deportista deportistaTOP() {
        int deportistamax = 0;
        int numero_ = 0;
        for (Deportista deportista : listadeportista) {
            if (deportista.getMedallas() > deportistamax) {
                deportistamax = deportista.getMedallas();
            }
        }
        for (Deportista deportista : listadeportista) {
            if (deportista.getMedallas() == deportistamax) {
               return deportista;
            }

        }
        return null;
    }

    public void verMedallasDeportista(Deportista deportista) {
        for (Deportista deportista1 : listadeportista){
            if (deportista1.getEquipo().equals(deportista.getEquipo())){
                for (Deportista deportista_ : listadeportista) {
                    if (deportista.getMedallas() ==0){
                        System.out.println("el deportista"+deportista_.getNombre()+" de "+deportista_.getEquipo().getPais());
                    }else {
                        System.out.println("El deportista " +deportista_.getNombre()+" tiene "+deportista_.getMedallas());
                    }
                }
            }
        }

    }

    public Deportista deportistamasjoven() {
        LocalDate deportistamasjoven = null;
        Deportista deportista_ = null;
        for (Deportista deportista : listadeportista) {
            if (deportistamasjoven == null || deportista.getFecha_nacimiento().isAfter(deportistamasjoven)){ // el null actua como proteccion si no hay valor guarda y si hay valor comapra
                deportistamasjoven=deportista.getFecha_nacimiento();
                deportista_ = deportista;
            }
        }
        return deportista_;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Deportista> getListadeportista() {
        return listadeportista;
    }

    public void setListadeportista(ArrayList<Deportista> listadeportista) {
        this.listadeportista = listadeportista;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listadeportista=" + listadeportista +
                '}';
    }


}
