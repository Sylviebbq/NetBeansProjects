
package PATT2;

import javax.swing.JOptionPane;

public class ObjetoV {

  public static void main(String[] args) {

    Vehiculo vehiculoA = new Vehiculo(
        "Gris",
        "Elegante",
        40,
        30,
        "abierto");
    Camioneta vehiculoB = new Camioneta(
        "Verde",
        "Pesado",
        50,
        30,
        "abierto");
    CarroDeportivo vehiculoC = new CarroDeportivo(
        "Rojo",
        "Pesado",
        40,
        30,
        "cerrado");

    JOptionPane.showMessageDialog(
        null,
        "Puerta A "
            +
            vehiculoA.abrir("cerrado")
            +
            ", Ventana A "
            +
            vehiculoA.abrirV("cerrado"));

    JOptionPane.showMessageDialog(
        null,
        "Puerta B "
            +
            vehiculoB.abrir("abierto")
            +
            ", Ventana B "
            +
            vehiculoA.abrirV("cerrado"));

    JOptionPane.showMessageDialog(
        null,
        "Puerta C "
            +
            vehiculoC.abrir("cerrado")
            +
            ", Ventana C "
            +
            vehiculoC.abrirV("----"));
  }
}
