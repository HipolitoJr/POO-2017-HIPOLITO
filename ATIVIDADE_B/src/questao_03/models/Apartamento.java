package questao_03.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Apartamento {

    Pessoa proprietario;
    double area;
    int qtdComodos;

    public Apartamento(Pessoa proprietario, double area, int qtdComodos) {
        this.proprietario = proprietario;
        this.area = area;
        this.qtdComodos = qtdComodos;
    }

    public double getArea() {
        return area;
    }

    public int getQtdComodos() {
        return qtdComodos;
    }

    public String mostraAp(){
        return "Nome Proprietario: " + proprietario.getNome() + "\nArea: " + getArea() + "m²\nQtd. Cômodos: " + getQtdComodos();
    }
}
