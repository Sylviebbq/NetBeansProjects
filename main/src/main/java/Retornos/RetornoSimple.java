package Retornos;

import javax.swing.JOptionPane;

public class RetornoSimple {

    public static void main(String[] args) {

        imprimirPantalla("Dante", "Maria");
        imprimirPantalla("Dario", "Monica");
        imprimirPantalla("David", "Martha");
        imprimirPantalla("los que no empiezan con d", "y otros");

    }

    public static void imprimir(String nombre, String companiero){

        System.out.println(dimeHola(nombre, companiero));

    }

    public static void imprimirPantalla(String nombre, String companiero){

        JOptionPane.showMessageDialog(null, dimeHola(nombre, companiero));

    }

    public static String dimeHola(String nombre, String companiero) {

        return "Hola, " + nombre + " Y companiero" + " Como estas?. \nTu Nombre tiene "
                + largoDelNombre(nombre) + " caracteres. \nY tu numero es el "
                + tuNumeroEs() + " La suma de 3 hasta 8: "
                + sumaDesdeHasta(3, 8);
    }

    public static int largoDelNombre(String nombre) {

        return nombre.length();

    }

    public static int tuNumeroEs() {
        return (int) (Math.random() * 10);
    }

    public static int sumaDesdeHasta(int inicio, int limite) {

        if (inicio >= limite) {

            return inicio;

        } else {
            return inicio + sumaDesdeHasta(inicio + 1, limite) + tuNumeroEs();
        }
    }
}
