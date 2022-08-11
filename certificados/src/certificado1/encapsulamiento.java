package certificado1;

public class encapsulamiento {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coche");
        coche.setVelocidadMaxima(120);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);

        System.out.println(coche.getTipo());
        System.out.println(moto.getTipo());
        System.out.println(moto.getTipo() + "" + moto.getVelocidadMaxima());
    }
}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    public boolean isRapido() {
        return this.rapido;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (this.rapido == false) {
            this.tipo = tipo;
        }
    }
}
