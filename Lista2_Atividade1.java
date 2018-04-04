/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;

public class Lista2_Atividade1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* Entrada de dados */
		System.out.println("Digite um numero: ");
		int num1 = in.nextInt();

		/* Saida de Dados */
		/* Condicao para neutros */
		if (num1 == 0) {
			System.out.println("O numero é neutro.");
		} else {

			/* Condicao para pares */
			if (num1 % 2 == 0) {
				System.out.println("o numero é Par.");
				/* Positivo ou negativo  SE for par*/
				if (num1 > 0) {
					System.out.println("O número é Positivo.");
				} else {
					System.out.println("O número é Negativo.");
				}
			} else {
				/* Condicao para impares */
				System.out.println("o número é Impar.");
				if (num1 > 0) {
					/* Positivo ou negativo SE for impar */
					System.out.println("O número é Positivo.");
				} else {
					System.out.println("O número é Negativo.");
				}
			}

		}
	}
}
