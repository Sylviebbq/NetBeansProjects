/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablasDeMultiplicar;

public class TablasDeMultiplicar {

    public static void main(String[] args) {
        int origen = 0;
        int limite = 12;
        for (int actual = origen; actual <= limite; actual++) {
            hacerTabla(actual);
        }
    }

    public static void hacerTabla(int valor) {
        int origenTabla = 0;
        int limiteTabla = 12;
        int tabla = valor;
        for (int actualTabla = origenTabla; actualTabla <= limiteTabla; actualTabla++) {
            int resultado = tabla * actualTabla;
            System.out.println(tabla + " * " + actualTabla + " = " + resultado);
        }
    }

}
