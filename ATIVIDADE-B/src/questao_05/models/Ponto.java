package questao_05.models;

/**
 * Created by aluno on 09/11/17.
 */
public class Ponto {

    int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
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

}
