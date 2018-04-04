/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Lista2_Atividade4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* Criaçao de um Array de 3 posições */
		Integer[] valor = new Integer[3];

		/* Entrada de dados */
		System.out.println("Digite 3 valores:");
		for (int i = 0; i < 3; i++) {
			valor[i] = in.nextInt();
		}

		/* Escolha da opcao para Crescente e Decrescente */
		System.out.println("Digite c para ordem crescente e d para ordem decrescente: ");
		String opc = in.next();

		switch (opc) {
		case "c":
			System.out.println("Numeros crescentes: ");
			/* Funcao Array.Sort coloca os valores em ordem Crescente */
			Arrays.sort(valor);
			for (int i : valor)
				System.out.println(i);
			break;
		case "d":
			System.out.println("Numeros decrescentes: ");
			/* Collections.ReverseOrder coloca em ordem decrescente */
			Arrays.sort(valor, Collections.reverseOrder());
			for (int i : valor)
				System.out.println(i);
			break;

		default:
		    /* caso seja digitado outra opcao*/
			System.out.println("Digite c para crescente ou d para decrescente.");
			break;
		}

	}

}
