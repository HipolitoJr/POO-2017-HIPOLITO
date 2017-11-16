package questao_03.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Cargo {

    String nome;
    int horasSemanais;

    public Cargo(String nome, int horasSemanais) {
        this.nome = nome;
        this.horasSemanais = horasSemanais;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }
}
