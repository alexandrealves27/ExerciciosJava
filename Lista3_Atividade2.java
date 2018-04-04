/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
public class Lista3_Atividade2 {

	public static void main(String[] args) {
		/* i é a variável usada para a primeira coluna que aumenta conforme o loop */
		for(int i = 0; i<=9;i++){
			/* j é a variável usada para a segunda coluna que aumenta dentro do primeiro loop */
			for(int j = 0; j<=9; j++){
				/* imprime o  valor de i e de j e o resultado da multiplicacao deles */
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}

	}

}
