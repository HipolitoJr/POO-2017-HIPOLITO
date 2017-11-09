package questao_03.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Data {

    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

}
