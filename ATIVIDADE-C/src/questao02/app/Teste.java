package questao02.app;

import questao02.model.Casa;
import questao02.model.Porta;

public class Teste {

    public static void main(String[] args) {

        Casa casa = new Casa("Vermelho", 4);

        for (int i=0; i < 4; i++){
            Porta porta = new Porta();
            porta.abrir();
            casa.adicionaPorta(porta);
        }

        System.out.println(casa.toString());

    }

}
