package lista03;

public class Exercicio08 {

	/*
	 * 8)Imprima os números de 1 a 10, pulando a impressão do número 5 e
	 * interrompendo o loop quando encontrar o número 8.
	 */

	public static void main(String[] args) {

		for (int numero = 1; numero <= 10; numero++) {
			
			if (numero == 5) {
				continue;
			} else if (numero == 8) {
				break;
			}
			
			System.out.println(numero);
		}
	}
}
