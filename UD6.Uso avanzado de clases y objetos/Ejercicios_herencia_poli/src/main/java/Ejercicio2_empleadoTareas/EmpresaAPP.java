package Ejercicio2_empleadoTareas;

public class EmpresaAPP {

    public static void asignartareas (Empleado empleado) {
        System.out.println("asignando tareas al empleado");
        empleado.realizartarea();
    }

    public static void main(String[] args) {
        System.out.println("=== Usando el array polimorfico ===");
        Empleado [] empleados = new Empleado[3];
        empleados[0] = new Desarrollador();
        empleados[1] = new Diseñador();
        empleados[2] = new Gerente();

        for (Empleado empleado : empleados){
            empleado.realizartarea();
        }

         Gerente gerente = new Gerente();
        Desarrollador desarrollador = new Desarrollador();

        asignartareas(gerente);
        asignartareas(desarrollador);




    }
}
