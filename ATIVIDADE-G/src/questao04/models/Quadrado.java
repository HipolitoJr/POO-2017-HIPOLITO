package questao04.models;

/**
 * Created by aluno on 14-12-2017.
 */
public class Quadrado extends FiguraGeometrica {


    public Quadrado(int lado1) {
        super(lado1);
    }

    @Override
    public int obterArea() {
        return getLado1() * getLado1();
    }

    @Override
    public int obterPerimetro() {
        return getLado1() * 4;
    }
}
