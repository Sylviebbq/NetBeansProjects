/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATT3;

/**
 *
 * @author adm
 */
public class Dormitorio extends Objeto{

    public String colorPared;
    private String disenio;
    private int ventanas;

    public Dormitorio(String colorPared, String disenio, int ventanas) {
        this.colorPared = colorPared;
        this.disenio = disenio;
        this.ventanas = ventanas;
    }

    public String getDisenio() {
        return disenio;
    }

    public int getVentanas() {
        return ventanas;
    }

    public String getColorPared() {
        return colorPared;
    }
    

}
