package app;

import model.Data;
import model.Funcionario;

public class TestesFuncionarios {


    public static void main(String[] args) {

        Data dataAdmissao = new Data();
        dataAdmissao.dia = 28;
        dataAdmissao.mes = 07;
        dataAdmissao.ano = 2000;

        Funcionario f1 = new Funcionario("Hipolito Junior", 1200.00, dataAdmissao, "400882");

        f1.recebeAumento(150);
        f1.mostra();

        Funcionario f2 = new Funcionario();
        f2.setNome("Joao");

        Funcionario f3 = f2;

        if (f2 == f3)
            System.out.println("iguais");
        else
            System.out.println("diferentes");

    }

}
