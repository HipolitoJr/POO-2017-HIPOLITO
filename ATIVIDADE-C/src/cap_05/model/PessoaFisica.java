package cap_05.model;

public class PessoaFisica {

    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = valida(cpf);
    }

    private String valida(String cpf) {
        if (cpf.length() == 10)
            return cpf;
        return "000.000.000-00";
    }
}
