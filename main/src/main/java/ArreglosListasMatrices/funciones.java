package ArreglosListasMatrices;

import javax.swing.JOptionPane;

public class funciones extends problema{

    int mul = 10;
    int numerou = 123456;
    int numeroProcesado = 0;
    int residuo = 1000;
    int i = 6;
    int x = 0;
    int[] enteroAutomatico = new int[6];

    /**
     * @return the numero
     */
    public int getNumerou() {
        return numerou;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumerou(int numerou) {
        this.numerou = numerou;
    }

    /**
     * @return the numeroProcesado
     */
    public int getNumeroProcesado() {
        return numeroProcesado;
    }

    /**
     * @return the residuo
     */
    public int getResiduo() {
        return residuo;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    public int numeroA(int numerou, int i, int numeroaleer){
        while (i != 0){
            i--;
            numeroProcesado = numerou;
            numeroProcesado = numeroProcesado / mul;
            numeroProcesado = numeroProcesado * mul;
            residuo = numerou - numeroProcesado;
            x = residuo / (mul / 10);
            mul = mul * 10;
            JOptionPane.showMessageDialog(null, "Elemento: " + i + ": " + enteroAutomatico[i]);
        }
        return enteroAutomatico[numeroaleer];
    } 
}
