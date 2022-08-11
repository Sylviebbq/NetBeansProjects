package certificado1;

public class objeto {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche(2, 90);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);

    }
}

class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche() {
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Dentro del constructor");
    }

    public Coche(int puertas, int velocidad) {
        this.numeroDePuertas = 5;
        this.velocidadMaxima = 120;
        System.out.println("Dentro del constructor");
    }

    public void acelerar() {

        velocidadActual += 15;

    }

    public void decelerar() {

        velocidadActual -= 15;

    }
}
