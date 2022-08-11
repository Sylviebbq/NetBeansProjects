package PATT;

public class Desli extends Ventana {

    public int deslizable;

    public Desli(int deslizable, String disenio, int alto, int ancho, int grosor, int cerrojo) {
        super(disenio, alto, ancho, grosor, cerrojo, deslizable);
        this.deslizable = deslizable;
    }

    public Desli(int deslizable, String color, String disenio, int alto, int ancho, int grosor, int cerrojo) {
        super(color, disenio, alto, ancho, grosor, cerrojo, deslizable);
        this.deslizable = deslizable;
    }

    public int getDeslizable() {
        return deslizable;
    }
}
