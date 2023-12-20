package lista03;

public class Exercicio04 {

	/*
	 * 4)Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do
	 * loop externo, pulando a impressão do número 3 em cada iteração interna usando
	 * continue.
	 */

	public static void main(String[] args) {

		for (int numero = 1; numero <= 5; numero++) {

			for (int segundo = 1; segundo <= 5; segundo++) {
				System.out.println("interno: " + segundo);

				if (segundo == 2) {
					segundo++;
					continue;
				}
			}

			System.out.println("externo: " + numero);
		}
	}
}
