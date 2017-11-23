package questao02.model;

public class Casa {

    private String cor;
    private int totalPortas;
    private Porta[] portas;
    int pos = 0;

    public Casa(String cor, int totalPortas) {
        this.cor = cor;
        this.totalPortas = totalPortas;
        this.portas = new Porta[totalPortas];
    }

    public void pinta(String cor){
        this.cor = cor;
    }

    public int quantasPortasAbertas(){
        int totalAbertas = 0;

        for (int i = 0; i < this.pos; i++){
            if (this.portas[i].isAberta()){
                totalAbertas++;
            }

        }

        return totalAbertas;
    }

    public int getTotalPortas() {
        return totalPortas;
    }

    public void adicionaPorta(Porta p){

        if (this.pos < (this.getTotalPortas() - 1)){
            this.portas[pos] = p;
            this.pos++;
        }


    }

    @Override
    public String toString() {
        String ts = "Cor da casa: " + this.cor + "\n";
        ts += "Total portas: " + this.getTotalPortas() + "\n";
        ts += "Total abertas: " + this.quantasPortasAbertas();
        return ts;
    }
}
