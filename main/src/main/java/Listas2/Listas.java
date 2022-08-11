
package Listas2;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> listado = new ArrayList<>();
        listado.add("Dante");
        listado.add("Augusto");
        listado.add(0, "Casella");

        listado.remove("Dante");
        listado.remove(0);
        
        listado.contains("Dante");
        System.out.println(listado.get(0));
    }

}
