package lista03;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9)Crie um loop infinito que solicita ao usu�rio um n�mero. Pare o loop quando
	 * o n�mero 0 for inserido.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Digite um n�mero:");
			int segundo = sc.nextInt();
			
			if (segundo == 0) {
				break;
			} else {
				System.out.println("O n�mero � " + segundo);
			}
			
		} while (numero == 0);
		sc.close();
		System.out.println("O n�mero 0 foi digitado. Fim!");

	}
}
