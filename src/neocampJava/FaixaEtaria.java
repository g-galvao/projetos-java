package neocampJava;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {

		System.out.println("**** FAIXA ETÁRIA ****\n");
		System.out.println("\nDigite a idade e descubra a faixa etária :)\n\n");

		int idade;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a idade: ");
		idade = leia.nextInt();

		if (idade >= 10 & idade <= 14) {
			System.out.println("\n > Categoria Infantil");
		} else if (idade >= 15 & idade <= 17) {
			System.out.println("\n > Categoria Juvenil");
		} else if (idade >= 18 & idade <= 25) {
			System.out.println("\n > Categoria Adulto");
		}

	}

}
