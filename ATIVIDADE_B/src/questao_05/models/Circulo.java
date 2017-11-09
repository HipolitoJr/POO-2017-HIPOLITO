package questao_05.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Circulo {

    double pi = 3.14;

    double raio;
    double diametro;
    Ponto centro;

    public double circunferencia(){

        double circunferencia = 2 * this.pi * this.raio;

        return circunferencia;
    }

    public double area(){
        double area =  this.pi * (this.raio * this.raio);
        return area;
    }

    public Ponto getCentro() {
        return centro;
    }


}
