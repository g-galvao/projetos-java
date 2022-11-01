package projetos;

import java.util.Scanner;

public class OndeEstaVetores {
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**** ONDE ESTÁ O NÚMERO? ****\n");

        System.out.println("Digite 10 números inteiros e depois descubra a posição dele no vetor\n");

        int[] vetor = new int[10];
        int numeroEncontrar;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + "do vetor\nDigite um número: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("\n > Qual número deseja encontrar?");
        numeroEncontrar = leia.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroEncontrar) {
                System.out.println("Número " + numeroEncontrar + " encontrado na posiçao " + i + " do vetor.");
            }
        }
    }
}
