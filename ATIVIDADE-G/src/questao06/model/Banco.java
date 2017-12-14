package questao06.model;

public class Banco {

    public Conta[] contas;
    int ultimo = 0;

    public Banco(int qtdContas) {
        this.contas = new Conta[qtdContas];
    }

    public String adiciona(Conta conta){
        if (this.totalDeContas() < this.contas.length){
            this.contas[ultimo] = conta;
            ultimo++;
            return "Adicionada com Sucesso.";
        }
        return "Banco Cheio!";
    }

    public Conta pegaConta(int numeroConta){
        for (int i=0; i < ultimo; i++){
            if (numeroConta == this.contas[i].getNumero()){
                return this.contas[i];
            }
        }

        return null;
    }

    public int totalDeContas(){
        return ultimo;
    }

}
