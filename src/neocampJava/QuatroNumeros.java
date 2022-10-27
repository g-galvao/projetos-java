package neocampJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuatroNumeros {

	public static void main(String[] args) {
		
		System.out.println("**** QUATRO NÚMEROS ****");
		System.out.println("");
		
		int num1, num2, num3, num4;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o 2º número: ");
		num2 = leia.nextInt();
		System.out.println("Digite o 3º número: ");
		num3 = leia.nextInt();
		System.out.println("Digite o 4º número: ");
		num4 = leia.nextInt();
		
		System.out.println("\n > Diferença: " + ((num1 * num2) - (num3 * num4)));

	}

}
