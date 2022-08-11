package ExamenFormativo1;

import javax.swing.JOptionPane;

public class Vehiculo {

    public static void main(String[] args) {

        AutoDeportivo aDeporte = new AutoDeportivo(
                "Carrera",
                "Rojo",
                "Liviana",
                "Diesel");

        Camioneta aCamioneta = new Camioneta(
                "Trabajo",
                "Azul",
                "Pesado",
                "Gasolina");

        aDeporte.setColor(
                JOptionPane.showInputDialog(null,
                        "Color Deportivo?"));

        aCamioneta.setColor(
                JOptionPane.showInputDialog(null,
                        "Color Camioneta?"));

        aDeporte.setLlantas(
                JOptionPane.showInputDialog(null,
                        "Llantas Deportivo"));

        aCamioneta.setLlantas(
                JOptionPane.showInputDialog(null,
                        "Llantas Camioneta?"));

        aDeporte.setMotor(
                JOptionPane.showInputDialog(null,
                        "Motor Deportivo"));

        aCamioneta.setMotor(
                JOptionPane.showInputDialog(null,
                        "Motor Camioneta?"));

        aDeporte.setTipo(
                JOptionPane.showInputDialog(null,
                        "Tipo Deportivo"));

        aCamioneta.setTipo(
                JOptionPane.showInputDialog(null,
                        "Tipo Camioneta?"));

        String abiertoD = aDeporte.abrirP(
                JOptionPane.showInputDialog(null,
                        "Puerta Abierta Deportivo?"));

        String abiertoC = aCamioneta.abrirP(
                JOptionPane.showInputDialog(null,
                        "Puerta Abierta Camioneta?"));

        JOptionPane.showMessageDialog(null,
                "Es un auto de "
                + aDeporte.getTipo()
                + ", de color "
                + aDeporte.getColor()
                + ", con llantas "
                + aDeporte.getLlantas()
                + " y motor de "
                + aDeporte.getMotor()
                + ", Se encuentra"
                + abiertoD);

        JOptionPane.showMessageDialog(null,
                "Es un auto de "
                + aCamioneta.getTipo()
                + ", de color "
                + aCamioneta.getColor()
                + ", con llantas "
                + aCamioneta.getLlantas()
                + " y motor de "
                + aCamioneta.getMotor()
                + ", Se encuentra"
                + abiertoC);

    }
}
