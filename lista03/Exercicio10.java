package lista03;

public class Exercicio10 {

	/*
	 * 10)Dado um array de n�meros inteiros, imprima cada n�mero at� encontrar um
	 * n�mero negativo. Use break para interromper o loop nesse ponto.
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
