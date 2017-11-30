package model;

public class Conta {

    public static int cont = 0;

    protected double saldo;
    private int numero;

    public void deposita(double valor){
        this.numero = cont++;
        this.saldo += valor;
    }


    public void saca(double valor){
        this.saldo -= valor;
    }


    public void atualiza(double taxa){
        this.saldo += this.getSaldo() * taxa;
    }


    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                "}\n";
    }
}
