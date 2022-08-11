
package PATT3;

public class Silla extends Objeto{

    public String color;
    private String disenio;
    private String material;

    public String ocupada(String sillaOcupada) {

        if (sillaOcupada.equals("ocupada")) {
            return "Si";
        } else if (sillaOcupada.equals("noocupada")) {
            return "No";
        }
        return "Error";
    }

    public Silla(String color, String disenio, String material) {
        this.color = color;
        this.disenio = disenio;
        this.material = material;
    }

    public String getDisenio() {
        return disenio;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

}
