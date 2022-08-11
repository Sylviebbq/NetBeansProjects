/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaAbstracionInterfaz;

public class HerenciaAbstracionInterfaz {

    public static void main(String[] args) {
        AutoDeportivo autoDeportivo = new AutoDeportivo(2);
        autoDeportivo.abrirPuerta(1);
        autoDeportivo.encender();
        System.out.println(autoDeportivo.avisarRetro(autoDeportivo.isEncendido(), -3));
        autoDeportivo.dimeTuNombre();

        Camioneta camioneta = new Camioneta();
        camioneta.abrirPuerta(2);
        camioneta.encender();
        System.out.println(camioneta.avisarRetro(camioneta.isEncendido(), 3));
        camioneta.dimeTuNombre();
    }
}


