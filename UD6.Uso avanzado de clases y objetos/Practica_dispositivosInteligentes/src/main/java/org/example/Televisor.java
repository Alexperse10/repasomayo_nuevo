package org.example;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronicar() {
        System.out.println("Sincronizando televisor con control remoto");
    }

    @Override
    public void encender() {
        if (isEncendido()) {
            System.out.println("El televisor ya esta encendido no se puede volver a encender");
        }else {
            System.out.println("Encendiendo televisor...");
            setEncendido(true);
        }

    }
}
