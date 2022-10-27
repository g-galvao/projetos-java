package neocampJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {
		
		System.out.println("**** ABONO SALARIAL ****");
		System.out.println("");
		
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("####.##");
		
		
		System.out.println("Digite o valor de SALÁRIO: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor de ABONO: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\n > O novo salário é: R$ " + decimal.format(novoSalario));
	}

}
