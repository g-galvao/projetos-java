package neocampJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaNotas {
	
	public static void main (String args[]) {
		
		System.out.println("**** MÉDIA DE NOTAS ****");
		System.out.println("");
		
		float nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("##.#");
		
		System.out.println("Digite a nota da 1ª prova: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a nota da 2ª prova: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a nota da 3ª prova: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite a nota da 4ª prova: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\n > A média das notas: " + decimal.format(media));
		
	}

}
