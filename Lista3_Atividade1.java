/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;

public class Lista3_Atividade1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/* Declarando variáveis */
		float maior = 0;
		float menor = 999999999;

		/* Iniciando loop */
		for (int i = 0; i < 15; i++) {
			float num = in.nextFloat();
			/* se o numero digitado for menor que o da variavel menor ele guarda o numero */
			if (num < menor) {
				menor = num;
			}
			/* se o numero for maior que o da variavel maior ele guarda o numero */
			if (num > maior){
				maior = num;
			}
			
		}
		/* Saida de dados */
		System.out.println("MAIOR: "+maior +" menor: "+menor);
	}

}
