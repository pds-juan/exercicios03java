package lista03;

public class Exercicio01 {

	/*
	 * 1)Imprima os n�meros de 1 a 10, mas pare a execu��o do loop quando chegar a 5.
	 */

	public static void main(String[] args) {

		for (int numero = 1; numero < 10; numero++) {

			if (numero == 5) {
				break;
			}

			System.out.println(numero);
		}
	}
}
