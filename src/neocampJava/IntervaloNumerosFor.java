package projetos;

import java.util.Scanner;

public class IntervaloNumerosFor {

    public static void main(String[] args) {

        int num1, num2;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();

        if (num1 > num2) {
            System.out.println("O intervalo digitado é inválido! O primeiro número deve ser menor do que o segundo número.");
            System.exit(0);
        }

        for (int contador = num1; contador <= num2; contador++) {
            if (contador % 3 == 0 && contador % 5 == 0)
                System.out.println(contador + " é multiplo de 5 e 3.");
        }
    }
}
