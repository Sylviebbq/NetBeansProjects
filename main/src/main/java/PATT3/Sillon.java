
package PATT3;

public class Sillon extends Objeto{

    public String color;
    private String disenio;
    private String material;

    public String ocupada(String sillonOcupada) {

        if (sillonOcupada.equals("ocupada")) {
            return "Si";
        } else if (sillonOcupada.equals("noocupada")) {
            return "No";
        }
        return "Error";
    }

    public Sillon(String color, String disenio, String material) {
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
