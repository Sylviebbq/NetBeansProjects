package com.mycompany.main;

import javax.swing.JOptionPane;

public class Main5 {

    static int LIMITE = 7;

    public static void main(String[] args) {

        int y = 1;
        for (int x = 1; x <= LIMITE; x++) {
            y = y * x;
            System.out.println(y);
        }
        JOptionPane.showMessageDialog(null, y);
        //////////////////////////////////////
    }

}
