package questao_03.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Veiculo {

    int cor;
    String chassi;
    boolean ligado;
    Montadora montadora;

    public Veiculo(String chassi, Montadora montadora) {
        this.ligado = false;
        this.chassi = chassi;
        this.montadora = montadora;
    }

    public int getCor() {
        return cor;
    }

    public void pintar(int cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public String getMontadora() {
        return montadora.getNome();
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

    public String mostraEstado(){
        if (this.isLigado())
            return "Esta veiculo esta ligado";
        else
            return "Este veiculo esta desligado";
    }

    public String mostraVeiculo(){
        return "Cor: " + getCor() + "\nChassi: " + getChassi() + "\nMontadora: " + getMontadora();
    }

}
