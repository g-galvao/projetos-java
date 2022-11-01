package vetores;

import java.util.Scanner;

public class VetoresMulti {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("**** VETOR MULTI TAREFAS ****\n");

        System.out.println("Digite 10 números inteiros e depois descubra as posições\n");

        int[] vetor = new int[10];
        int soma = 0;
        float media;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número do vetor: ");
            vetor[i] = leia.nextInt();
            soma += vetor[i];
        }

        int contador = 0;
        System.out.println("\n > Números nos índices ímpares: ");
        while (contador < 10) {
            if (contador % 2 == 1) {
                System.out.print(vetor[contador] + " ");
            }
            contador++;
        }

        System.out.println("\n > Números pares digitados: ");

        for (int j : vetor) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println("\n > Números digitados: ");

        for (int j : vetor) {
            System.out.print(j + " ");
        }

        media = (float) soma / vetor.length;

        System.out.println("\n > Soma dos números digitados: " + soma);
        System.out.println(" > Média dos números digitados: " + media);

    }
}
