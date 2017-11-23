package cap_05.app;

import cap_05.model.Data;
import cap_05.model.Funcionario;

public class TestesFuncionarios {


    public static void main(String[] args) {

        Data dataAdmissao = new Data();
        dataAdmissao.dia = 28;
        dataAdmissao.mes = 07;
        dataAdmissao.ano = 2000;

        Funcionario f1 = new Funcionario("Hipolito Junior");

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
