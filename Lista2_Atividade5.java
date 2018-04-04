/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;

public class Lista2_Atividade5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* Entrada de dados */
		System.out.println("Digite o primeiro numero: (1/3)");
		float num1 = in.nextFloat();
		System.out.println("Digite o segundo numero: (2/3)");
		float num2 = in.nextFloat();
		System.out.println("Digite o terceiro numero: (3/3)");
		float num3 = in.nextFloat();

		System.out.println("O que voce deseja fazer?");
		System.out.println("Digita o numero da opcao desejada.");
		System.out.println("[1]Calcular media - [2]Calcular soma - [3]Calcular multiplicação");
		int opc = in.nextInt();

		/* MEDIA */
		if (opc == 1) {
			float result1 = (num1 + num2 + num3) / 3;
			System.out.println("Opção " +opc+ " Resultado da Media: "+result1);
		} else
			/* SOMA */
			if (opc == 2) {
			float result2 = (num1 + num2 + num3);
			System.out.println("Opção " +opc+ " Resultado da Soma: "+result2);
		} else
			/* MULTIPLICAÇÃO */
			if (opc == 3) {
			float result3 = (num1 * num2 * num3);
			System.out.println("Opção " +opc+ " Resultado da Multiplicação "+result3);
		}else {
				System.out.println("Opção inválida.");
			}
	
	}

}
