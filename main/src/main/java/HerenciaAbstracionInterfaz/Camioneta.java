package HerenciaAbstracionInterfaz;

public class Camioneta extends Vehiculo {

    public Camioneta() {
        super(4);
    }

    @Override
    public void dimeTuNombre() {
        System.out.println("Soy una camioneta");
    }

}
