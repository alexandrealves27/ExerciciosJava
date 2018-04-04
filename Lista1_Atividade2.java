/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;

public class Lista1_Atividade2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* Entrada de dados */
		System.out.println("Digite a temperatura em graus Centigrados: ");
		float temp = in.nextFloat();

		/* calculo da fórmula */
		float F = (9 * temp + 160) / 5;

		/*Saida de dados */
		System.out.print("A temperatura de " + temp + " em Fahrenheit �: " + F);

	}

}
