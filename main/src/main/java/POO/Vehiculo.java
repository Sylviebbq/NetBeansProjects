package POO;

public class Vehiculo {

    public String color;
    public int anio;
    public String transmision;
    public String tipoFreno;
    public String tipoDireccion;

    private String fabricante;

    protected int cantidadDeCargaSoportada;

    public Vehiculo() {
        this.fabricante = "Dante";
    }

    public String getFabricante() {
        return fabricante;
    }

}
