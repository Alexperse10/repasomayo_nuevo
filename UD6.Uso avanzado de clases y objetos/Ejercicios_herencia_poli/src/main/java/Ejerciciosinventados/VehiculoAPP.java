package Ejerciciosinventados;

public class VehiculoAPP {
    public static void probarVehiculo(Vehiculo vehiculo){
        System.out.println("Arrancando el vehiculo");
        vehiculo.mover();
    }
    public static void main(String[] args) {
        Vehiculo [] vehiculos = new Vehiculo[3]; // creo el array vacio de tres objetos
        vehiculos [0] = new Moto() ;
        vehiculos[1] = new Coche();
        vehiculos[2] = new Bicicleta();

        for (Vehiculo vehiculo : vehiculos){
            vehiculo.mover();
        }

        Vehiculo Moto = new Moto();
        Vehiculo bicicleta = new Bicicleta();
        Vehiculo coche = new Coche();

        probarVehiculo(Moto);


     }

}
