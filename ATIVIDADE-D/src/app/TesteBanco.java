package app;

import model.*;

public class TesteBanco {

    public static void main(String[] args) {

        Banco banco = new Banco(10);
        AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.1);

        Conta conta = new Conta();
        conta.deposita(1000);
        Conta conta1 = new Conta();
        conta1.deposita(1000);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.deposita(1500);
        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.deposita(1750);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.deposita(1250);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        contaPoupanca1.deposita(1375);

        banco.adiciona(conta);
        banco.adiciona(conta1);
        banco.adiciona(contaCorrente);
        banco.adiciona(contaCorrente1);
        banco.adiciona(contaPoupanca);
        banco.adiciona(contaPoupanca1);

        for (int i=0; i < banco.totalDeContas(); i++){
            atualizadorDeContas.roda(banco.contas[i]);
        }


    }

}
