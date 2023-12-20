package lista03;

public class Exercicio10 {

	/*
	 * 10)Dado um array de números inteiros, imprima cada número até encontrar um
	 * número negativo. Use break para interromper o loop nesse ponto.
	 */

	public static void main(String[] args) {

		int[] numeros = { 0, 1, 2, 3, 4, 5, -6, 7, 8, 9 };

		for (int numero : numeros) {
			if (numero < 0) {
				break;
			} else {
				System.out.println(numero);
			}
		}
	}
}
