package certificado1;
public class ejercicio2 {
    public static void main(String[] args) {

        int numeroIf = 15;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        int estacion = 1;

        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es cero");
        }

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 1);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case 1:
                System.out.println("Es verano");
                break;
            case 2:
                System.out.println("Es invierno");
                break;
            case 3:
                System.out.println("Es otono");
                break;
            case 4:
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Estacion por estacion");

        }

    }
}
