package questao_04;

/**
 * Created by aluno on 09/11/17.
 */
public class ArCondicionado {

    String marca;
    String cor;
    long btus;
    boolean ligado;
    double temperatura;
    double velocidade;
    String modo;

    public ArCondicionado(String marca, long btus) {
        this.marca = marca;
        this.btus = btus;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public long getBtus() {
        return btus;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
}
