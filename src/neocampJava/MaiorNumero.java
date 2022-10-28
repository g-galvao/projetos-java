package neocampJava;

import java.util.Iterator;
import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		System.out.println("**** QUAL É O MAIOR? ****\n");
		System.out.println("\nDigite três inteiros e descubra qual deles é o maior :)\n\n");

		int numero, maior = 0, contador = 0;
		Scanner leia = new Scanner(System.in);

		while (contador < 3) {
			contador++;
			System.out.println("Digite o " + contador + "º número: ");
			numero = leia.nextInt();

			if (numero > maior) {
				maior = numero;
			}
		}

		System.out.println("\n > O maior número digitado é o " + maior);

	}

}
