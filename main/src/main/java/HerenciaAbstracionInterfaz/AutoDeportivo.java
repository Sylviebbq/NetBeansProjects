/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaAbstracionInterfaz;

/**
 *
 * @author adm
 */
public class AutoDeportivo extends Vehiculo {

    private String nombreCarinio;

    public AutoDeportivo(int numeroDePuertas) {
        super(numeroDePuertas);
    }
    
    @Override
    public boolean abrirPuerta(int numeroPuerta){
        System.out.println("Soy auto deportivo, por eso las abro hacia arriba");
        return true;
    }

    @Override
    public void dimeTuNombre() {
        System.out.println("Soy un auto deportivo");
    }

    public String getNombreCarinio() {
        return nombreCarinio;
    }

    public void setNombreCarinio(String nombreCarinio) {
        this.nombreCarinio = nombreCarinio;
    }

}
