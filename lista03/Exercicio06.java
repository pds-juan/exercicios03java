package lista03;

public class Exercicio06 {

	/*
	 * 6)Imprima os n�meros de 1 a 10, pulando a impress�o do n�mero 5, usando
	 * continue.
	 */

	public static void main(String[] args) {

		for (int numero = 1; numero <= 10; numero++) {

			if (numero == 5) {
				continue;
			}

			System.out.println(numero);
		}

	}

}
