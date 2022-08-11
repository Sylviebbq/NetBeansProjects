
package PATT;

public class Ventana {

    public String color;
    private String disenio;

    private int alto;
    private int ancho;
    private int grosorVentana;
    private int cerrojo;
    int deslizable = getDeslizable();

    public int abrir(String abrirVentana) {
        if (abrirVentana.equals("abierto")) {
            return cerrojo;
        } else if (abrirVentana.equals("abierto")) {
            return 1;
        } else if (abrirVentana.equals("cerrado")) {
            return 0;
        }
        return 0;
    }

    public Ventana(String disenio, int alto, int ancho, int grosor, int cerrojo, int deslizable) {
        this.disenio = disenio;
        this.alto = alto;
        this.ancho = ancho;
        this.grosorVentana = grosor;
        this.cerrojo = cerrojo;
        this.deslizable = deslizable;
    }

    public Ventana(String color, String disenio, int alto, int ancho, int grosor, int cerrojo, int deslizable) {
        this.color = color;
        this.disenio = disenio;
        this.alto = alto;
        this.ancho = ancho;
        this.grosorVentana = grosor;
        this.cerrojo = cerrojo;
        this.deslizable = deslizable;
    }

    public String getDisenio() {
        return disenio;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getGrosorVentana() {
        return grosorVentana;
    }

    public int getCerrojo() {
        return cerrojo;
    }

    public int getDeslizable() {
        return deslizable;
    }
}