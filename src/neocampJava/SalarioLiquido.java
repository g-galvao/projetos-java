package neocampJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		

		System.out.println("**** SALÁRIO LÍQUIDO ****");
		System.out.println("");
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		Scanner leia = new Scanner (System.in);
		DecimalFormat decimal = new DecimalFormat("####.##");
		
		System.out.println("Digite o valor do Salário Bruto: R$ ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o valor do Adicional Noturno: R$ ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite o valor de Horas Extras: R$ ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o valor total de Descontos: R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos;
		
		System.out.println("\n > Salário Líquido: R$ " + salarioLiquido);
		
	}

}
