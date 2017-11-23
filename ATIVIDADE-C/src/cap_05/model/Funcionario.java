package cap_05.model;

public class Funcionario {

    public static int cont = 0;

    private int id;
    private String nome;
    private String departamento;
    private double salario;
    private Data dataAdmissao;
    private String rg;

    public Funcionario(){

    }

    public Funcionario(String nome) {
        this.id = cont++;
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.rg = rg;
    }

    public void recebeAumento(double aumento){
        this.salario += aumento;
    }

    public double calculaGanhoAnual(){
        return this.salario * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void mostra(){
        System.out.println("Nome: " + getNome());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Ganho anual: R$" + calculaGanhoAnual());
        System.out.println("Data admissao: " + dataAdmissao.formatada());
    }
}
