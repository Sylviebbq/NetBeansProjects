/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.JOptionPane;

public class Tarea {
    
        public static void main(String[] args) {

        int x = 0;
        int y = 1;

        int LIMY = Integer.valueOf(JOptionPane.showInputDialog("Ingrese El Primer Valor"));
        int LIMX = Integer.valueOf(JOptionPane.showInputDialog("Ingrese El Segundo Valor")); 

        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        for(LIMY = 1; LIMY<=LIMX; LIMY++){
            x = x + LIMY;
            System.out.println(x);
        }
        // System.out.println("La suma es: " + x);
        // JOptionPane.showMessageDialog(null,"La suma es: " + x);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        for (LIMY = 1; LIMY <= LIMX; LIMY++){
            y = y * LIMY;
            System.out.println(y);
        }
        
        System.out.println("La suma es: " + x);
        System.out.println("La multiplicacion es: " + y);
        JOptionPane.showMessageDialog(null,"La suma es: " + x);
        JOptionPane.showMessageDialog(null,"La multiplicacion es " + y);

    }
    
}
