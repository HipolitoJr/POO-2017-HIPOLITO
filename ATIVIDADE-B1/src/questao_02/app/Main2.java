package questao_02;

import questao_02.models.Circulo;
import questao_02.models.Ponto;

import javax.swing.*;

/**
 * Created by aluno on 16/11/17.
 */
public class Main2 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(3);

        String escolha;

        do {

            String menu = getMenu();
            String status = status(circulo);

            escolha = JOptionPane.showInputDialog(status + menu);

            switch (escolha){

                case "1":
                    String ponto = JOptionPane.showInputDialog("Informe um Ponto (x y):");
                    circulo.movimentarCirculo(new Ponto(Integer.parseInt(ponto.split(" ")[0]), Integer.parseInt(ponto.split(" ")[1]) ));
                    break;

                case "2":
                    circulo.aumentarRaio();
                    break;

                case "3":
                    circulo.diminuirRaio();
                    break;

                case "4":

                    break;

                case "5":

                    break;

                default:
                    break;

            }

        }while (!escolha.equals("0"));

    }

    public static String status(Circulo circulo){
        return circulo.toString();
    }

    public static String getMenu(){

        return "1 - Movimentar Circulo" +
                "\n2 - Aumentar Raio" +
                "\n3 - Diminuir Raio" +
                "\n4 - Verificar Ponto" +
                "\n5 - Verificar Circulo";

    }

}
