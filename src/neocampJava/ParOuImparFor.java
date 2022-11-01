package projetos;

import java.util.Scanner;

public class ParOuImparFor {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        int numero, contador, par = 0, impar = 0;

        System.out.println("**** PAR OU ÍMPAR? ****\n");

        System.out.println("Digite 10 números inteiros para saber quantos são pares e quantos são ímpares");

        for (contador = 1; contador <= 10; contador++) {
            System.out.println("\n Digite o " + contador + "º número: ");
            numero = leia.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else if (numero % 2 == 1) {
                impar++;
            }
        }

        System.out.println("\n > Você digitou " + par + " numéro(s) par(es) e " + impar + " número(s) ímpar(es).");
    }
}
