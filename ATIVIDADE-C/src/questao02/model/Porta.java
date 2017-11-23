package questao02.model;

public class Porta {

    private boolean aberta;
    private String cor;

    public Porta() {
        this.aberta = false;
    }

    public boolean isAberta() {
        return this.aberta;
    }

    public void abrir() {
        this.aberta = true;
    }

    public void fecar() {
        this.aberta = false;
    }
}
