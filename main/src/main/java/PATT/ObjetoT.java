package PATT;

import javax.swing.JOptionPane;

public class ObjetoT {

        public static void main(String[] args) {

                Ventana ventanaA = new Ventana(
                                "elegante",
                                40,
                                30,
                                3,
                                0,
                                1);
                Ventana ventanaB = new Ventana(
                                "blanco",
                                "normal",
                                50,
                                20,
                                5,
                                1,
                                1);
                ventanaA.color = "celeste";
                ventanaB.color = "azul";

                JOptionPane.showMessageDialog(
                                null,
                                ventanaA.abrir("cerrado"));

                JOptionPane.showMessageDialog(
                                null,
                                ventanaB.abrir("abierto"));
        }

}
