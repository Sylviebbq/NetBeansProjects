/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATT3;

/**
 *
 * @author adm
 */
public class Mesa extends Objeto{

    public String color;
    private String disenio;
    private String material;

    public String ocupada(String mesaOcupada) {

        if (mesaOcupada.equals("ocupada")) {
            return "Si";
        } else if (mesaOcupada.equals("noocupada")) {
            return "No";
        }
        return "Error";
    }

    public Mesa(String color, String disenio, String material) {
        this.color = color;
        this.disenio = disenio;
        this.material = material;
    }

    public String getDisenio() {
        return disenio;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
    
}
