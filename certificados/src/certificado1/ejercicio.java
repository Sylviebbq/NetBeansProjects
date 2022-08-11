package certificado1;

public class ejercicio {

    public static void main(String[] args) {

        System.out.println(suma(1, 2, 3));  

        Coche miCoche = new Coche();
        miCoche.insertarPuerta();
        System.out.println("El numero de puertas es: " + miCoche.puertas);

    }

    public static int suma(int var1, int var2, int var3) {

        int resultado;
        resultado = var1 + var2 + var3;
        return resultado;

    }

}

class Coche {
    public int puertas;

    public void insertarPuerta() {
        this.puertas++;
    }
}