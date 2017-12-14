package questao04.models;

/**
 * Created by aluno on 14-12-2017.
 */
public class Retangulo extends FiguraGeometrica {

    private int lado2;

    public Retangulo(int lado1, int lado2) {
        super(lado1);
        this.lado2 = lado2;
    }

    @Override
    public int obterArea() {
        return this.getLado1() * this.getLado2();
    }

    @Override
    public int obterPerimetro() {
        return (this.getLado1() * 2)  + (this.getLado2() * 2);
    }

    public int getLado2() {
        return lado2;
    }
}
