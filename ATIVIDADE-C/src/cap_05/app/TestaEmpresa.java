package cap_05.app;

import cap_05.model.Empresa;
import cap_05.model.Funcionario;

public class TestaEmpresa {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("123.123.123", 10);

        Funcionario f1 = new Funcionario();
        f1.setNome("Hipolito");
        f1.recebeAumento(937);

        Funcionario f2 = new Funcionario();
        f2.setNome("Joao");
        f2.recebeAumento(880);

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);

        System.out.println(empresa.mostraFuncionarios());

    }

}
