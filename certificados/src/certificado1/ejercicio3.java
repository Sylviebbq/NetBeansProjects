package certificado1;

public class ejercicio3 {
    // Para practicar la encapsulación:
    // Crear clase Persona.
    // Crear variables las privadas edad, nombre y telefono de la clase Persona.
    // Crear gets y sets de cada propiedad.
    // Crear un objeto persona en el main.
    // Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
    // telefono, por último muéstralas por consola.

    public static void main(String[] args) {

        Persona persona1 = new Persona(18, "Kevin", "0988868401");

        System.out.println("Su edad es: " + persona1.getEdad());
        System.out.println("Su nombre es: " + persona1.getNombre());
        System.out.println("Su numero es: " + persona1.getTelefono());

        persona1.setEdad(19);
        persona1.setNombre("Juan");
        persona1.setTelefono("099173751");

        System.out.println("Su edad es: " + persona1.getEdad());
        System.out.println("Su nombre es: " + persona1.getNombre());
        System.out.println("Su numero es: " + persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String telefono;
    private String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(int edad, String nombre, String telefono) {

        // constructor

        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

}