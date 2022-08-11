package HerenciaTarea;

public abstract class Persona implements FuncionesPersona {

    private boolean respirando;
    private boolean comiendo;
    public boolean lleno;
    private boolean caminando;

    public Persona() {
        this.respirando = true;
        this.comiendo = false;
        this.lleno = true;
    }


    public boolean estaRespirando() {
        return respirando;
    }

    public boolean estaComiendo() {
        return comiendo;
    }

    public boolean estaCaminando() {
        return caminando;
    }

    @Override
    public void respirar() {
        respirando = true;
    }

    public void norespirar() {
        respirando = false;
    }

    @Override
    public void comer() {
        comiendo = true;
        lleno = true;
    }

    public void nocomer() {
        comiendo = false;
    }

    @Override
    public void caminar() {
        caminando = true;
    }

    public void nocaminar() {
        caminando = false;
    }
}
