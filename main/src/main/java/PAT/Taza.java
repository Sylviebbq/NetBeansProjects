/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAT;

/**
 *
 * @author adm
 */
public class Taza {

    public String color;
    private String disenio;

    private int alto;
    private int anchoDisenio;
    private int grosor;
    private int capacidad;

    public int beber(String elementoABeber) {
        if (elementoABeber.equals("agua")) {
            return capacidad;
        } else if (elementoABeber.equals("tequila")) {
            return 5;
        } else if (elementoABeber.equals("leche")) {
            return 10;
        }
        return 0;
    }

    public Taza(String disenio, int alto, int anchoDisenio, int grosor, int capacidad) {
        this.disenio = disenio;
        this.alto = alto;
        this.anchoDisenio = anchoDisenio;
        this.grosor = grosor;
        this.capacidad = capacidad;
    }

    public Taza(String color, String disenio, int alto, int anchoDisenio, int grosor, int capacidad) {
        this.color = color;
        this.disenio = disenio;
        this.alto = alto;
        this.anchoDisenio = anchoDisenio;
        this.grosor = grosor;
        this.capacidad = capacidad;
    }

    public String getDisenio() {
        return disenio;
    }

    public int getAlto() {
        return alto;
    }

    public int getAnchoDisenio() {
        return anchoDisenio;
    }

    public int getGrosor() {
        return grosor;
    }

    public int getCapacidad() {
        return capacidad;
    }

}
