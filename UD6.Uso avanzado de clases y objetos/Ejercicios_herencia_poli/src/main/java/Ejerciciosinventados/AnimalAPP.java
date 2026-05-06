package Ejerciciosinventados;

public class AnimalAPP {


    public static void main(String[] args) {
        Animal [] animal = new Animal [3]; // creo un array vacio de tres objetos;
        animal [0] = new Pajaro(); // creo un objeto pajaro
        animal [1] = new Gato(); // creo otro objeto gato
        animal[2] = new Perro();

        for (Animal animal1 : animal) {
            animal1.hacersonido();
        }

    }
}
