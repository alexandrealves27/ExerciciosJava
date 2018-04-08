/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
public class Lista3_Atividade4 {

	public static void main(String[] args) {
		/* valor de i começará em 1000 e acabará em 1999 */
		for (int i=1000; i < 2000; i++){
			/* SE o valor de i divido por 11 tiver resto igual a 5 então ele será impresso na tela */
			if(i % 11 == 5){
				/* imprime o valor */
				System.out.println(i);
			}
		}
	}

}
