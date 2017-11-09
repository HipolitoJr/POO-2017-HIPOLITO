package questao_03.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Pessoa {

    String nome;
    String cpf;
    String sexo;
    Data dataNascimento;

    public Pessoa(String nome, String cpf, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento.formatada();
    }
}
