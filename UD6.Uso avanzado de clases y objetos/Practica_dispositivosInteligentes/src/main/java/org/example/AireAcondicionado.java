package org.example;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre) {
        super(nombre);
    }



    @Override
    public void sincronicar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }

    @Override
    public void encender() {
        if (isEncendido()){
            System.out.println("el aire acondicionado ya esta encedido no se puede volver a encender");
        }else {
            System.out.println("Encendiendo el aire acondicionado...");
            setEncendido(true);
        }
    }
}
