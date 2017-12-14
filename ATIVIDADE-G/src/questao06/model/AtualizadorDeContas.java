package questao06.model;

import app.TesteConta;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta conta){
        String toStringConta = "**********Conta " + conta.getNumero() + "**********\n\n";
        toStringConta += "Saldo anterior: R$" + conta.getSaldo() + "\n";
        conta.atualiza(this.selic);
        toStringConta += "Saldo final: R$" + conta.getSaldo() + "\n";
        this.saldoTotal += conta.getSaldo();

        TesteConta.printMsg(toStringConta);
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
