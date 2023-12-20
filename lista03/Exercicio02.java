package lista03;

public class Exercicio02 {

	/*
	 * 2)Imprima os números ímpares de 1 a 10, usando continue para pular os números pares.
	 */

	public static void main(String[] args) {

		int numero = 0;

		while (numero < 10) {

			if (numero % 2 == 0) {
				numero++;
				continue;
			}

			System.out.println(numero);
			numero++;
		}
	}
}
