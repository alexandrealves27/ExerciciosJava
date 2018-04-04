/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
public class Lista1_Atividade4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*Entrada de dados*/
		System.out.println("Digite o valor de A: ");
		int a = in.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = in.nextInt();

		/*Substituindo variáveis*/
		int c = a;
		a = b;
		b = c;

		/*Saida de dados*/
		System.out.println("Valor de A-B: "+ a);
		System.out.println("Valor de B-A: "+ b);
	}

}
