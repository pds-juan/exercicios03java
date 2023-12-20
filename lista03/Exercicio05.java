package lista03;

public class Exercicio05 {

	/*
	 * 5)Imprima os números de 1 a 10, mas pare o loop quando encontrar um número
	 * maior que 7.
	 */

	public static void main(String[] args) {
		
		for (int numero = 1; numero <= 10; numero++) {
			
			if (numero > 7) {
				break;
			}
			
			System.out.println(numero);
		}
	}

}
