package questao_02.models;

/**
 * Created by aluno on 16/11/17.
 */
public class Circulo {

    static double PI = 3.14;

    private double raio;
    private double diametro;
    private Ponto centro;

    public Circulo(double raio) {
        if (raio <= 0)
            this.raio = 1;
        else
            this.raio = raio;
        this.diametro = raio*2;
        this.centro = new Ponto();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void movimentarCirculo(Ponto ponto){
        this.centro = ponto;
    }

    public void aumentarRaio(){
        this.setRaio(this.getRaio() + 1);
        this.setDiametro(this.getRaio()*2);
    }

    public void diminuirRaio(){
        if (this.getRaio() > 1){
            this.setRaio(this.getRaio() - 1);
            this.setDiametro(this.getRaio()*2);
        }
    }

    public double circunferencia(){
        double circunferencia = 2 * PI * this.raio;
        return circunferencia;
    }

    public double area(){
        double area =  PI * (this.raio * this.raio);
        return area;
    }

    public String verificaCirculo(Circulo circulo2){

        double distanciaCentros = this.getCentro().distanciaPontos(circulo2.getCentro());
        double somaRaios = this.getRaio() + circulo2.getRaio();

        if (distanciaCentros < somaRaios)
            return "Secantes";
        else if (distanciaCentros == somaRaios)
            return "Tangentes";
        else
            return "Externos";
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", diametro=" + diametro +
                ", centro=" + centro +
                '}' + "\n";
    }
}
