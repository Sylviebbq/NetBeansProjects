package Prueba1;

import java.util.ArrayList;
import java.util.List;

public class Perro extends Animales {

    int i = 0;
    List<String> comedor = new ArrayList<>();

    private String color;
    private int tamanio;
    private int pesoKg;
    private int edad;
    public boolean lleno;

    public Perro(
            String color,
            int tamanio,
            int pesoKg,
            int edad) {

        this.color = color;
        this.tamanio = tamanio;
        this.pesoKg = pesoKg;
        this.edad = edad;
    }

    @Override
    public void llenarComida() {

        while (i < 10) {

            comedor.add("comidaPerro");

        }
        System.out.print("El comedor esta lleno");
    }

    @Override
    public void comer() {
        comedor.remove("comidaPerro");
        lleno = true;

        System.out.println("El perro esta lleno");
    }
}
