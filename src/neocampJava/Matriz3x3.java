package vetores;

import java.util.Scanner;

public class Matriz3x3 {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("**** MATRIZ 3X3 ****\n");

        System.out.println("Vamos preencher uma matriz 3x3?\n");

        int[][] matriz = new int[3][3];
        int[] diagonalP = new int[3];
        int[] diagonalS = new int[3];
        int somaP = 0, somaS = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um valor para a posição: [" + i + "][" + j + "]: ");
                matriz[i][j] = leia.nextInt();
                if (i == j) {
                    diagonalP[i] = matriz[i][j];
                }
                if (i + j == 2) {
                    diagonalS[j] = matriz[i][j];
                }
            }
        }

        System.out.print(" > Elementos da Diagonal Principal: ");
        for (int j = 0; j < 3; j++) {
            System.out.print(diagonalP[j] + " ");
            somaP += diagonalP[j];
        }

        System.out.print("\n > Elementos da Diagonal Secundária:  ");
        for (int j = 0; j < 3; j++) {
            System.out.print(diagonalS[j] + " ");
            somaS += diagonalS[j];
        }

        System.out.print("\n > Soma dos elementos da Diagonal Principal: " + somaP);
        System.out.print("\n > Soma dos elementos da Diagonal Secundária: " + somaS);
    }
}
