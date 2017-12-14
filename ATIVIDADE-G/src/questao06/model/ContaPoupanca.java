package questao06.model;

public class ContaPoupanca extends ContaCorrente {

    public ContaPoupanca() {
        super();
    }

    @Override
    public void atualiza(double taxa){
        super.atualiza(taxa * 3);
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }
}
