package com.mycompany.main;

import javax.swing.JOptionPane;

public class ContadorMonedaValor {

    public static void contarMonedas(int cantidadMonedas) {
        int monto = cantidadMonedas;
        double monto2 = 0;

        while (monto > 0) {

            double valorMoneda = Double.valueOf(JOptionPane.showInputDialog("Ingrese Valor de la moneda"));
            monto2 = monto2 + valorMoneda;
            monto++;
        }
        JOptionPane.showMessageDialog(null, monto2);
    }

    public static void sumarNUmeros(int totalNumero) {

        }
}
