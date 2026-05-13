package org.example;

import java.util.Scanner;

public class Inscripcion {
    private Piloto piloto;
    private  CategoriaDrift categoria;
    private Boolean pagado;
Scanner sc = new Scanner(System.in);
    public Inscripcion(Piloto piloto){
        this.piloto = piloto;
        setCategoria();
        pagado = false;
        System.out.print("Piloto"+getPiloto().getNombre()+" realizando inscripcion");


    }

    public void setCategoria() {
        while (true){
            System.out.println("Elige una categoria");
            try {
                categoria = CategoriaDrift.valueOf(sc.nextLine());
//                this.categoria = categoria; eso no hace falta ponerlo
                break;
            }catch (Exception e) {
                System.out.println("Categoria incorrecta, vuelve a intentarlo");
            }
        }

    }

    public Boolean getPagado() {
        return pagado;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public CategoriaDrift getCategoria() {
        return categoria;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "piloto=" + piloto +
                ", categoria=" + categoria +
                ", pagado=" + pagado +
                '}';
    }
}
