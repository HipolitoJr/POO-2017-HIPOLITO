package cap_05.model;

public class Data {

    public int dia;
    public int mes;
    public int ano;


    public String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
