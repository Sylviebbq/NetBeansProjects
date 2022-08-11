package ArreglosListasMatrices;

public class ArreglosListasMatrices {

    public static void main(String[] args) {

        int[] enteroAutomatico = new int[10];
        int holder = 1;
        int division = 1;
        for (int i = 1; i < 10; i++) {

            holder = i * 100;
            holder /= 100;
            enteroAutomatico[i] = holder;
            enteroAutomatico[i] *= division;
            if (division <= 10){
                division = division * 10;
            }
        }
        for (int i = 0; i < 10; i++) {

            System.out.println("Elemento: " + i + ": " + enteroAutomatico[i]);

        }

    }

}
