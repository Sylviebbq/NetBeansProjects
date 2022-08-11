package ArreglosListasMatrices;

import javax.swing.JOptionPane;

public class problema {

    public void main(String[] args) {

        int mul = 10;
        int numero = 193817;
        int numeroProcesado = 0;
        int residuo = 1000;
        int i = 6;

        int[] enteroAutomatico = new int[6];

        while (i != 0) {
            i--;
            numeroProcesado = numero;
            numeroProcesado = numeroProcesado / mul;
            numeroProcesado = numeroProcesado * mul;
            residuo = numero - numeroProcesado;
            enteroAutomatico[i] = residuo / (mul / 10);
            mul = mul * 10;
            System.out.println("Elemento: " + i + ": " + enteroAutomatico[i]);
            JOptionPane.showMessageDialog(null, "Elemento: " + i + ": " + enteroAutomatico[i]);
        }

        

        // funciones.numeroA(1,1,1);
        // funciones.numero(JOptionPane.showInputDialog(null,"inserte numero a
        // descomponer",JOptionPane.showInputDialog("inserte la cantidad de numeros en
        // el digito",JOptionPane.showInputDialog("que numero desea leer"))));
    }
}