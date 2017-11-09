package questao_03.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Conta {

    Pessoa titular;
    long numero;
    double saldo;

    public Conta(Pessoa titular, long numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > 0){
            this.saldo -= valor;
        }
    }

    public String mostraConta(){
        return "Nome Titular: " + titular.getNome() + "\nNumero: " + getNumero() + "\nSaldo: " + getSaldo();
    }
}
