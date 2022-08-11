package Prueba1;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animales {

    int i = 0;
    List<String> comedor = new ArrayList<>();

    private String color;
    private int tamanio;
    private int pesoKg;
    private int edad;
    public boolean lleno;

    public Gato(
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

            comedor.add("comidaGato");

        }
        System.out.print("El comedor esta lleno");
    }

    @Override
    public void comer() {
        comedor.remove("comidaGato");
        lleno = true;

        System.out.println("El gato esta lleno");
    }

    @Override
    public void envejecer() {

    }

    public String getColor() {
        return color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public int getEdad() {
        return edad;
    }
}