package neocampJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		System.out.println("**** PAR OU ÍMPAR? ****\n");
		System.out.println("\nDigite um número e descubra se é par ou ímpar :)\n\n");

		int numero;
		Scanner leia = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("####.#");

		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			System.out.println("\n > " + numero + " é par e a sua raiz quadrada é " + decimal.format(Math.sqrt(numero)));
		} else if (numero % 2 == 1) {
			System.out.println(
					"\n > " + numero + " é ímpar e elevado ao quadrado é " + decimal.format(Math.pow(numero, 2)));
		}

	}

}
