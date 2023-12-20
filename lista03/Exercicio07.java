package lista03;

public class Exercicio07 {

	/*
	 * 7)Use um loop para iterar sobre os números de 1 a 5. Pare o loop quando
	 * encontrar o número 3. Use switch para imprimir uma mensagem diferente para
	 * cada número.
	 */

	public static void main(String[] args) {

		for (int numero = 1; numero < 6; numero++) {
			
			if (numero == 3) {
				System.out.println("número 3, looping interrompido!");
				break;
			} else {

				switch (numero) {
				case 1:
					System.out.println("número 1");
					break;

				case 2:
					System.out.println("número 2");
					break;

				case 4:
					System.out.println("número 4");
					break;

				case 5:
					System.out.println("número 5");
					break;

				default:
					System.out.println("número inválido");
					break;
				}
			}
		}
	}
}
