package vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasClasse {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("**** NOTAS DA CLASSE ****\n");

        System.out.println("Veja as notas da turma.\n");

        DecimalFormat decimal = new DecimalFormat("##.#");
        double soma = 0;
        double[][] notas = {{4.0, 5.0, 7.0, 3.0}, {2.5, 6.5, 4.7, 8.0}, {10.0, 8.5, 9.5, 8.0}, {9.0, 6.5, 7.6, 8.2}, {5.0, 5.0, 5.0, 6.3}, {7.0, 8.0, 9.0, 8.5}, {5.5, 3.5, 2.5, 1.0}, {8.0, 9.0, 10.0, 9.5}, {5.6, 5.8, 6.5, 7.0}, {7.5, 8.5, 9.5, 10.0}};

        for (int i = 0; i < notas.length; i++) {
            soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("\nNota do aluno " + i + " = " + notas[i][j]);
                soma += notas[i][j];
            }
            System.out.print("\n> Média do aluno " + i + " = " + decimal.format(soma / 4) + " \n");
        }

    }
}
