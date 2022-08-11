package HerenciaTarea;

public class HerenciaAbstracionInterfaz {

    public static void main(String[] args) {
        Hombre hombre = new Hombre();

        hombre.caminar();
        hombre.comer();
        hombre.respirar();
        hombre.reproducir();

        hombre.nocaminar();
        hombre.nocomer();
        hombre.norespirar();
        hombre.noReproducir();
        System.out.println("Hombre esta respirando? " + hombre.estaRespirando());
        System.out.println("Hombre esta caminando? " + hombre.estaCaminando());
        System.out.println("Hombre puede reproducirce? " + hombre.puedeReproducirse());

        Mujer mujer = new Mujer();
        mujer.caminar();
        mujer.comer();
        mujer.respirar();
        mujer.reproducir();

        mujer.nocaminar();
        mujer.nocomer();
        mujer.norespirar();
        mujer.noReproducir();
        System.out.println("Mujer esta respirando? " + mujer.estaRespirando());
        System.out.println("Mujer esta caminando? " + mujer.estaCaminando());
        System.out.println("Mujer puede reproducirce? " + mujer.puedeReproducirse());
    }
}
