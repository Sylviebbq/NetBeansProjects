/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAT;

import javax.swing.JOptionPane;

/**
 *
 * @author adm
 */
public class Objeto {
    
    public static void main(String[]args){
        Taza tazaDeDante = new Taza("Cubico", 3, 2, 1, 10);
        Taza tazaDeJuanitoPerez = new Taza("azul", "cilindrica", 5, 3, 1, 20);
        
        tazaDeDante.color = "rojo";
        tazaDeJuanitoPerez.color = "verde";
        JOptionPane.showMessageDialog(null, tazaDeDante.beber("agua"));
    }
    
}
