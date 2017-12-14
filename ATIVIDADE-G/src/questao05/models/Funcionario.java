package questao05.models;

/**
 * Created by aluno on 14-12-2017.
 */
public abstract class Funcionario {

    private String nome;
    private String sexo;
    private double salario;

    public Funcionario(String nome, String sexo, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }

    public abstract double getBonificacao();

    public double getSalario() {
        return salario;
    }
}
