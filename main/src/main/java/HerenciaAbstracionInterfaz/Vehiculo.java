/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaAbstracionInterfaz;

/**
 *
 * @author adm
 */
public abstract class Vehiculo implements FuncionesVehiculo, CapacidadPersonal {

    private boolean encendido;
    private int numeroDePuertas;
    private int kilometraje;

    public Vehiculo(int numeroDePuertas) {
        this.encendido = false;
        this.numeroDePuertas = numeroDePuertas;
        this.kilometraje = 0;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    @Override
    public boolean abrirPuerta(int numeroPuerta) {
        System.out.println("estoy abriendo la puerta" + numeroPuerta);
        return true;
    }

    @Override
    public String avisarRetro(boolean encendido, int avance) {
        if (encendido) {
            if (avance < 0) {
                return "Estoy retrocediendo, por eso pito el retro";
            } else {
                return "Estoy avanzando, por eso no pito el retro";
            }
        } else {
            return "El vehículo está apagado";
        }
    }

    @Override
    public abstract void dimeTuNombre();

}
