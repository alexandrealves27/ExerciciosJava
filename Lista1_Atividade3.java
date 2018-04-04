/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
public class Lista1_Atividade3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*Entrada de dados*/
		System.out.println("Para calcular a Lata de Oleo insira os seguintes dados: ");
		System.out.println("Insira o raio da lata: ");
		float raio = in.nextFloat();
		System.out.println("Digite a altura da Lata de Oleo: ");
		float altura = in.nextFloat();

		/*calculando o volume */
		float volume = (float) (3.14 * Math.pow(raio, 2) * altura);

		/*Saida de dados*/
		System.out.println("PI (3.14) multiplica o Raio ao Quadrado ("+ raio +") que multiplica a Altura ("+ altura +") e se obtem o Volume de:  " +volume);
	}

}
