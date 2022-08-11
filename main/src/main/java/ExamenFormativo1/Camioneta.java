package ExamenFormativo1;

public class Camioneta extends Vehiculo {

    public String tipo;
    private String color;
    private String llantas;
    private String motor;

    public String abrirP(String abrirAuto) {

        if (abrirAuto.equals("abierto")) {
            return "abierta";
        } else if (abrirAuto.equals("cerrado")) {
            return "Cerrada";
        }
        return "Valor Incorrecto";
    }

    public String abrirV(String abrirVentana) {

        if (abrirVentana.equals("abierto")) {
            return "abierta";
        } else if (abrirVentana.equals("carrado")) {
            return "cerrada";
        }
        return "Valor Incorrecto";
    }

    public Camioneta(
            String tipo,
            String color,
            String llantas,
            String motor) {

        this.tipo = tipo;
        this.color = color;
        this.llantas = llantas;
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public String getMotor() {
        return motor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }
}
