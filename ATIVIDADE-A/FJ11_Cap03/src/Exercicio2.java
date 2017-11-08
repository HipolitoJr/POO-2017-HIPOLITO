public class Exercicio2 {

    public static void main(String[] args) {

        for (int i=150; i<=300; i++){
            System.out.println(i);
        }

        int soma = 0;
        for (int i=1; i<=1000; i++){
            soma += i;
        }

        System.out.println("Soma de 1 ate 1000: "+soma);

        for (int i=1; i<=300; i++){
            if ((i % 3) == 0)
                System.out.println(i);
        }

        for (int i=1; i<=10; i++){
            long fatorial = i;
            long j = fatorial - 1;

            while (j != 0){
                fatorial *= j;
                j--;
            }

            System.out.println("Fatorial de " + i + " eh " + fatorial );
        }

        //serieFibonacci();

    }

    private static void serieFibonacci() {

        /*long anterior = 0;
        long atual = 1;
        long prox;

        for (int i=0; i<10; i++){
            prox = anterior + atual;
            System.out.print(anterior + ", ");
            anterior = atual;
            atual = prox;
        }*/

        System.out.println("Imprima os primeiros números da série de Fibonacci até passar de 100:");
        for (int i = 0, i1 = 0, i2 = 1; i1 + i2 <= 100 ; i++) {
            System.out.println("Série de Fibonacci: " + i1);
            i2 += i1;
            System.out.println("Série de Fibonacci: " + i2);
            i1 += i2;
        }


    }

}
