package org.example;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (isEncendido()) {
            System.out.println("El parlante ya esta encendido no se puede volver a encender");
        }else {
            System.out.println("Activando parlante con comando de voz");
            setEncendido(true);
        }
    }
}
