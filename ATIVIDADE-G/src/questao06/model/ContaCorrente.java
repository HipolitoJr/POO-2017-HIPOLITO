package questao06.model;

public class ContaCorrente extends Conta {


    public ContaCorrente() {
        super();
    }

    @Override
    public void atualiza(double taxa){
        super.atualiza(taxa * 2);
    }


    @Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor * 0.08;
    }
}
