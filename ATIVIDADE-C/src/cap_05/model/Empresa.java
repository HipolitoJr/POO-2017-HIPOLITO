package cap_05.model;

public class Empresa {

    private String cnpj;
    private Funcionario[] funcionarios;
    int pos = 0;

    public Empresa(String cnpj, int qtdFuncionarios) {
        this.cnpj = cnpj;
        this.funcionarios = new Funcionario[qtdFuncionarios];
    }


    public boolean adicionarFuncionario(Funcionario funcionario){

        if (this.temVaga()){
            funcionarios[pos] = funcionario;
            pos++;
            return true;
        }

        return false;
    }

    boolean temVaga(){
        return this.pos < (this.funcionarios.length - 1);
    }

    public String mostraFuncionarios(){

        String retorno = "Funcionarios: \n";

        for (int i=0; i < this.pos; i++){
            retorno += ">> " + this.funcionarios[i].nome + " - R$" + this.funcionarios[i].getSalario() + "\n";
        }

        return retorno;
    }

}
