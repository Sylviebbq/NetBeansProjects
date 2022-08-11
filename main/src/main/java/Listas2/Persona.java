package Listas2;

public class Persona {

    private String cedula;
    private String nombre;
    private String hobbies;
    private String raza;

    public Persona(String elNumeroDeCedula) {
        this.cedula = elNumeroDeCedula;
    }

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Persona(String cedula, String nombre, String hobbies) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.hobbies = hobbies;

    }

    public Persona(int numero) {
        if (numero == 0) {
            nombre = "Dante";
            cedula = "1241325";
            hobbies = "molestar estudiantes";
        }
    }

    public String dimelaCedula() {
        return cedula;
    }

    public String dimelaRaza() {
        return raza;
    }

    public String dimeelNombre() {
        return nombre;
    }

    public String dimelosHobbies() {
        return hobbies;
    }
}
