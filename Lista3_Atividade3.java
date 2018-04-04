/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
public class Lista3_Atividade3 {

	public static void main(String[] args) {
		/* declarando variaveis */
		int i = 1;
		int j = 1;
		do {
			/* imprime o valor de j e de i */
			System.out.println(j + "/" + i);
			/* aumenta o valor de i em 1*/
			i++;
			/* aumenta o valor de j em 2 */
			j = j + 2;
			/* quando i chegar a 50 j chega a 99 */
		} while (i <= 50);

	}

}
