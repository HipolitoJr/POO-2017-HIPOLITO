package questao05.models;

/**
 * Created by aluno on 14-12-2017.
 */
public class Gerente extends Funcionario {

    private double percentual;

    public Gerente(String nome, String sexo, double salario, double percentual) {
        super(nome, sexo, salario);
        this.percentual = percentual;
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() + (this.getSalario() * this.percentual);
    }
}
