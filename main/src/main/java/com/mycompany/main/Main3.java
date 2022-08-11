/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JOptionPane;

public class Main3 {

    public static void main(String[] args) {
        //void means no value returned

        int vA = Integer.valueOf(JOptionPane.showInputDialog("1"));
        int vB = Integer.valueOf(JOptionPane.showInputDialog("2"));

        if (vA > vB) {
            System.out.println(vA + " is the bigger number");
            System.out.println(vB + " is the nummber number");
        } else {
            System.out.println(vB + " is the bigger number");
            System.out.println(vA + " is the smaller number");
        }

        //String CONSTANTE = "whatever";s
        String datoIngresado1 = JOptionPane.showInputDialog("Ingrese primer valor");
        int primerValor = Integer.valueOf(datoIngresado1);
        String datoIngresado2 = JOptionPane.showInputDialog("Ingrese primer valor");
        int segundoValor = Integer.valueOf(datoIngresado2);

        if (primerValor > segundoValor) {
            JOptionPane.showMessageDialog(null, "El mayor valor es: " + primerValor);
            JOptionPane.showMessageDialog(null, "El menor valor es: " + segundoValor);

        } else {
            JOptionPane.showMessageDialog(null, "El mayor valor es: " + segundoValor);
            JOptionPane.showMessageDialog(null, "El menor valor es: " + primerValor);
        }
    }
}
