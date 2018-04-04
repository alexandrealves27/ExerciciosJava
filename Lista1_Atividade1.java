/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */

import java.util.Scanner;

public class Lista1_Atividade1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		/*Entrada de Dados */

		System.out.println("Insira um numero: ");
		float num1 = in.nextFloat();

		System.out.println("Insira um segundo numero: ");
		float num2 = in.nextFloat();
		
		/* Respostas */
		
		System.out.println(" + + RESULTADOS + + ");
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Diferenca: " + (num1 - num2));
		System.out.println("Produto: " + num1 * num2);
		System.out.println("Media: " + (num1 + num2 / 2));
	}

}
