package neocampJava;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {

		System.out.println("**** ORDEM CRESCENTE ****\n");
		System.out.println("\nDigite três inteiros e veja a ordem crescente :)\n\n");

		int numero, primeiro = 0, segundo = 0, terceiro = 0, contador = 0;
		Scanner leia = new Scanner(System.in);

		while (contador < 3) {
			contador++;
			System.out.println("Digite o " + contador + "º número: ");
			numero = leia.nextInt();

			if (numero > primeiro & numero > segundo & numero > terceiro) {
				segundo = primeiro;
				primeiro = numero;
			}
			if (numero < primeiro & numero > segundo & numero > terceiro) {
				terceiro = segundo;
				segundo = numero;
			}
			if (numero < primeiro & numero < segundo & numero < terceiro) {
				terceiro = numero;
			}
		}

		System.out.println("\n " + primeiro + " é o número mais alto, " + segundo + " é o segundo mais alto e o "
				+ terceiro + " é o terceiro mais alto");
	}

}
