package questao_01.models;

/**
 * Created by aluno on 16/11/17.
 */
public class ArCondicionado {

    public static int sequence = 1;
    public long numeroSerie;
    private String marca;
    private boolean ligado;
    private int temperatura;
    private int velocidade;
    private String modo;

    public ArCondicionado(String marca) {
        this.numeroSerie = sequence++;
        this.marca = marca;
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar(){
        if (!this.isLigado()){
            this.ligado = true;
            this.setModo("frio");
            this.setTemperatura(18);
        }
    }

    public void desligar(){
        this.ligado = false;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String aumentarVelocidade(){

        if (this.isLigado()) {
            if (this.getModo().equals("ventilador")) {
                if (this.getVelocidade() < 3){
                    this.setVelocidade(this.getVelocidade()+1);
                    return "Success!";
                }
                return "Velocidade no maximo";
            }
            return "Split nao esta no modo ventilador";
        }

        return "Split desligado";
    }

    public String diminuirVelocidade(){

        if (this.isLigado()) {
            if (this.getModo().equals("ventilador")) {
                if (this.getVelocidade() > 0){
                    this.setVelocidade(this.getVelocidade()+1);
                    return "Success!";
                }
                return "Velocidade no maximo";
            }
            return "Split nao esta no modo ventilador";
        }

        return "Split desligado";
    }

    public String aumentarTemperatura(){

        if (this.isLigado()) {
            if (this.getModo().equals("frio")) {
                if (this.getTemperatura() < 30) {
                    this.setTemperatura(this.getTemperatura() + 1);
                    return "Success!";
                }
            }
            return "Split nao esta no modo frio";
        }

        return "Split desligado";
    }


    public String diminuirTemperatura(){

        if (this.isLigado()) {
            if (this.getModo().equals("frio")) {
                if(this.getTemperatura() > 16) {
                    this.setTemperatura(this.getTemperatura() - 1);
                    return "Success!";
                }
            }
            return "Split nao esta no modo frio";
        }

        return "Split desligado";
    }




    public String alterarModo(int modo){

        switch (modo){
            case 1:
                this.setModo("frio");
                this.setTemperatura(18);
                break;

            case 2:
                this.setModo("ventilador");
                this.setVelocidade(1);
                break;

            default:
                return "Modo invalido";
        }

        return "Modo " + this.getModo() + " ativado";
    }


    @Override
    public String toString() {

        return "Split " + marca +
                "\nligado: " + ligado +
                "\ntemperatura: " + temperatura +
                "\nvelocidade: " + velocidade +
                "\nmodo: " + modo +
                "\n------------------\n\n";
    }
}
