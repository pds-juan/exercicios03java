package lista03;

public class Exercicio03 {

	/*
	 * 3)Crie um loop aninhado que imprima os n�meros de 1 a 5 para cada itera��o do
	 * loop externo. Use break para interromper o loop interno quando o n�mero 3 for
	 * atingido.
	 */

	public static void main(String[] args) {

		for (int numero = 1; numero <= 5; numero++) {

			for (int segundo = 1; segundo <= 5; segundo++) {
				System.out.println("interno: " + segundo);

				if (segundo == 3) {
					break;
				}
			}

			System.out.println("externo: " + numero);
		}
	}
}
