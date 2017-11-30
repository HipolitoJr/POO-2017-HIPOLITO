package app;

import model.AtualizadorDeContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import javax.swing.*;

public class TesteConta {

    public static void main(String[] args) {

        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);


        AtualizadorDeContas adc = new AtualizadorDeContas(0.1);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        printMsg("Saldo total das Contas: R$" + adc.getSaldoTotal());

    }


    public static void printMsg(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }

}
