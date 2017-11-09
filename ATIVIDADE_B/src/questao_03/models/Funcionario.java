package questao_03.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Funcionario {

    String nome;
    String empresa;
    Data dataNascimento;
    Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDataNascimento() {
        return dataNascimento.formatada();
    }

    public String getCargo() {
        return cargo.getNome();
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String mostra(){
        return "Nome: " + getNome() + "\nEmpresa: " + getEmpresa() + "\nCargo: " + getCargo();
    }

}
