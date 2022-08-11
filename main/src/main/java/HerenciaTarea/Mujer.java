package HerenciaTarea;

public class Mujer extends Persona {

    private boolean reproducir;

    public boolean puedeReproducirse() {
        return reproducir;
    }

    @Override
    public void reproducir() {
        reproducir = true;
    }

    public void noReproducir() {
        reproducir = false;
    }
}
