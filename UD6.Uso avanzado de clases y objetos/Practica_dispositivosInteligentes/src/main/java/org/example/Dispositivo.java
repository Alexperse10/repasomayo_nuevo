package org.example;

public abstract class Dispositivo {
    private String nombre;
    private boolean encendido;

    public Dispositivo(String nombre) {
    this.nombre = nombre;
    this.encendido = true;

    }

    public abstract void encender ();

    public void apagar () {

        if (!encendido){
            System.out.println("el dispositivo: "+nombre+" ya esta apagado, no se puede volver a apagar");
        }else {
            encendido = false;
            System.out.println("el dispositivo: "+nombre+" esta apagado");
        }
    }

    public void mostrarestado () {
        if (encendido) {
            System.out.println("el dispositivo: "+nombre+" esta encendido");
        }else {
            System.out.println("el dispositivo: "+nombre+" esta apagado");
        }
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", encendido=" + encendido +
                '}';
    }
}
