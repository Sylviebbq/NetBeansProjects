package PATT3;

import javax.swing.JOptionPane;

public class Objeto {

    public static void main(String[] args) {

        Sala sala = new Sala(
                "Azul",
                "Elegante",
                1);

        Silla silla = new Silla(
                "Blanco",
                "Basico",
                "Plastico");

        Sillon sillon = new Sillon(
                "Gris",
                "Pesado",
                "Madera");

        Mesa mesa = new Mesa(
                "Blanco",
                "Basico",
                "Plastico");

        Dormitorio dormitorio = new Dormitorio(
                "Gris",
                "Pesado",
                4);

        Banio banio = new Banio(
                "Gris",
                "Pesado",
                2);

        JOptionPane.showMessageDialog(null,
                "La sala es de color "
                + sala.getColorPared()
                + ", dormitorio de color "
                + dormitorio.getColorPared()
                + ", banio de color "
                + banio.getColorPared()
                + ", el dormitorio tiene una mesa de color "
                + mesa.getColor()
                + ", la sala tiene un sillon de color "
                + sillon.getColor()
                + "y una silla de color "
                + silla.getColor());

    }

}
