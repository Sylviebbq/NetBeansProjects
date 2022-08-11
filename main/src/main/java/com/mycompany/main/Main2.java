package com.mycompany.main;

import javax.swing.JOptionPane;

public class Main2 {

    public static void main(String[] args) {
        //void means no value returned

        System.out.println("Kevin");

        JOptionPane.showMessageDialog(null, "hi", "yes", 0);
        JOptionPane.showMessageDialog(null, "hola dante", "titulo", JOptionPane.ERROR_MESSAGE);

        String username = JOptionPane.showInputDialog(null, "please");

        System.out.println(username);
    }
}
