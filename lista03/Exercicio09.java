package lista03;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * 9)Crie um loop infinito que solicita ao usuário um número. Pare o loop quando
	 * o número 0 for inserido.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Digite um número:");
			int segundo = sc.nextInt();
			
			if (segundo == 0) {
				break;
			} else {
				System.out.println("O número é " + segundo);
			}
			
		} while (numero == 0);
		sc.close();
		System.out.println("O número 0 foi digitado. Fim!");

	}
}
