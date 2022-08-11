package PATT2;

public class Vehiculo extends ObjetoV {

    public String color;
    private String disenio;

    private int tipoVehiculo;
    private int alto;
    private int ancho;
    private String cerrojo;

    public String abrir(String abrirPuerta) {

        if (abrirPuerta.equals("abierto")) {
            return "Abierta";
        } else if (abrirPuerta.equals("cerrado")) {
            return "Cerrada";
        }
        return "Error";
    }

    public String abrirV(String abrirVent) {
        if (abrirVent.equals("abierto")) {
            return "Abierta";
        } else if (abrirVent.equals("cerrado")) {
            return "Cerrada";
        }
        return "Error";
    }

    public Vehiculo(String color, String disenio, int alto, int ancho, String cerrojo) {
        this.color = color;
        this.disenio = disenio;
        this.alto = alto;
        this.ancho = ancho;
        this.cerrojo = cerrojo;
    }

    public String getDisenio() {
        return disenio;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public String getCerrojo() {
        return cerrojo;
    }
}