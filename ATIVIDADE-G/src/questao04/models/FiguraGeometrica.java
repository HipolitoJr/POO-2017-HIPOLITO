package questao04.models;

/**
 * Created by aluno on 14-12-2017.
 */
public abstract class FiguraGeometrica {

    private int lado1;

    public FiguraGeometrica(int lado1) {
        this.lado1 = lado1;
    }

    public abstract int obterArea();

    public abstract int obterPerimetro();

    public int getLado1() {
        return this.lado1;
    }
}
