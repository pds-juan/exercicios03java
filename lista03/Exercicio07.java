package lista03;

public class Exercicio07 {

	/*
	 * 7)Use um loop para iterar sobre os n�meros de 1 a 5. Pare o loop quando
	 * encontrar o n�mero 3. Use switch para imprimir uma mensagem diferente para
	 * cada n�mero.
	 */

	public static void main(String[] args) {

		for (int numero = 1; numero < 6; numero++) {
			
			if (numero == 3) {
				System.out.println("n�mero 3, looping interrompido!");
				break;
			} else {

				switch (numero) {
				case 1:
					System.out.println("n�mero 1");
					break;

				case 2:
					System.out.println("n�mero 2");
					break;

				case 4:
					System.out.println("n�mero 4");
					break;

				case 5:
					System.out.println("n�mero 5");
					break;

				default:
					System.out.println("n�mero inv�lido");
					break;
				}
			}
		}
	}
}
