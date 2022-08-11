package Retornos;

public class Tarea {

    public static void main(String[] args) {
        int x = 97;
        while (x <= 122) {
            System.out.println(letra2(x++));
        }

        print(hola("Kevin"));
        print(hola("Maria"));

    }

    public static void print(String nombre){

        System.out.println(nombre);

    }
    
    public static String letra2(int Letrase2) {

        String letter = Character.toString(Letrase2);
        return letter;
    }

    public static String hola(String nombre){

        return "Hola " + nombre;

    }

    public static String letra(int letrase) {

        String result = "a";
        letrase++;

        switch (letrase) {
            case 1:
                result = ("a");
                break;
            case 2:
                result = ("b");
                break;
            case 3:
                result = ("c");
                break;
            case 4:
                result = ("d");
                break;
            case 5:
                result = ("e");
                break;
            case 6:
                result = ("f");
                break;
            case 7:
                result = ("g");
                break;
            case 8:
                result = ("h");
                break;
            case 9:
                result = ("i");
                break;
            case 10:
                result = ("j");
                break;
            case 11:
                result = ("k");
                break;
            case 12:
                result = ("l");
                break;
            case 13:
                result = ("m");
                break;
            case 14:
                result = ("n");
                break;
            case 15:
                result = ("o");
                break;
            case 16:
                result = ("p");
                break;
            case 17:
                result = ("q");
                break;
            case 18:
                result = ("r");
                break;
            case 19:
                result = ("s");
                break;
            case 20:
                result = ("u");
                break;
            case 21:
                result = ("v");
                break;
            case 22:
                result = ("w");
                break;
            case 23:
                result = ("x");
                break;
            case 24:
                result = ("y");
                break;
            case 25:
                result = ("z");
                break;
        }
        return result;
    }

}