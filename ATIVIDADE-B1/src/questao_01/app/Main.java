package questao_01;

import questao_01.models.ArCondicionado;

import javax.swing.*;
import java.awt.*;

/**
 * Created by aluno on 16/11/17.
 */
public class Main {



    public static void main(String[] args) {

        ArCondicionado arCondicionado = new ArCondicionado("chevrolet");

        String escolha;

        do {

            String menu = getMenu(arCondicionado);
            String status = status(arCondicionado);

            escolha = JOptionPane.showInputDialog(status + menu);

            switch (escolha){

                case "1":
                    if (!arCondicionado.isLigado())
                        arCondicionado.ligar();
                    else
                        arCondicionado.desligar();
                    break;

                case "2":
                    String modo = JOptionPane.showInputDialog("1 - Frio \n2 - Ventilador");
                    arCondicionado.alterarModo(Integer.parseInt(modo));
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, arCondicionado.aumentarTemperatura());
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, arCondicionado.diminuirTemperatura());
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, arCondicionado.aumentarVelocidade());
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null, arCondicionado.diminuirVelocidade());
                    break;

                default:
                    break;
            }


        }while (!escolha.equals("0"));

    }

    private static String getMenu(ArCondicionado ar) {

        if (ar.isLigado()){
            return  "1 - Liga/Desliga \n" +
                    "2 - Alterar modo \n" +
                    "3 - Aumentar Temp. \n" +
                    "4 - Diminuir Temp. \n" +
                    "5 - Aumentar Ventilador \n" +
                    "6 - Diminuir Ventilador";
        }else{
            return  "1 - Liga/Desliga \n" +
                    "0 - Encerrar";
        }

    }

    public static String status(ArCondicionado arCondicionado){

        return arCondicionado.toString();

    }

}
