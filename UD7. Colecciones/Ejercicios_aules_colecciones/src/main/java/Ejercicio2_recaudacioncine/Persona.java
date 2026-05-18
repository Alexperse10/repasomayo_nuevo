package Ejercicio2_recaudacioncine;

import java.util.Random;

public class Persona {
    private int edad;
    Random aleatorio = new Random();
    int aleatorio_ = aleatorio.nextInt(100)+3;
    public Persona() {
        this.edad = aleatorio_;
    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }
}
