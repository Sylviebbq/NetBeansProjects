
package PATT3;

public class Sala extends Objeto{

    public String colorPared;
    private String disenio;

    private int luz;

    public String ocupada(String salaOcupada) {

        if (salaOcupada.equals("ocupada")) {
            return "Si";
        } else if (salaOcupada.equals("noocupada")) {
            return "No";
        }
        return "Error";
    }

    public Sala(String colorPared, String disenio, int luz) {
        this.colorPared = colorPared;
        this.disenio = disenio;
        this.luz = luz;
    }

    public String getDisenio() {
        return disenio;
    }

    public int getLuz() {
        return luz;
    }

    public String getColorPared() {
        return colorPared;
    }
    
}
