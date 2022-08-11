package certificado1;

public class switchtest {
    public static void main(String[] args) {

        String estacion = "VERANO";
        String hoy_es = "SAVADO";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion);

        }

        switch (hoy_es) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Hoy es laborable");
                break;
            case "SAVADO":
            case "DOMINGO":
                System.out.println("Hoy no es laborable");
                break;

        }

    }
}
