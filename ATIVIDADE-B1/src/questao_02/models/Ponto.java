package questao_02.models;

/**
 * Created by aluno on 16/11/17.
 */
public class Ponto {

    private int x;
    private int y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int i, int i1) {
        this.x = i;
        this.y = i1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanciaPontos(Ponto ponto2){
        double distanciaAB = Math.sqrt(Math.pow((ponto2.x - this.x), 2) + Math.pow((ponto2.y - this.y), 2));
        return distanciaAB;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
