/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JOptionPane;

public class Main4 {

    static int LIMITE = 10;

    public static void main(String[] args) {

        int suma = 0;

        for (int actual = 1; actual <= LIMITE; actual++) {
            suma = suma + actual;
        }
        System.out.println("La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }

}
