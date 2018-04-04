/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
public class Lista2_Atividade2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* Entrada de dados */
		System.out.println("Digite o lado 1 do Triangulo:");
		float L1 = in.nextFloat();
		
		System.out.println("Digite o lado 1 do Triangulo:");
		float L2 = in.nextFloat();
		
		System.out.println("Digite o lado 1 do Triangulo:");
		float L3 = in.nextFloat();

		/* Verifica se é um triangulo */
		if(L1+L2>L3 || L2+ L3> L1 || L3+L1>L2){
			/* Condicao para triangulo equilatero */
			if(L1==L2 && L2 == L3){
				System.out.println("É um triangulo equilátero. Pois possui todos os lados iguais.");
			}else
				/* Condicao para triangulo escaleno */
				if(L1!=L2 && L2!=L3 && L3!=L1){
				System.out.println("É um triangulo escaleno. Pois possui todos os lados diferentes.");
			}else
				/* Condicao para triangulo isoceles */
				if(L1==L2 && L2!=L3 || L3==L2 && L2!=L1 || L1==L3 && L3!=L2){
				System.out.println("É um trinagulo isóceles. Pois possui dois lados iguais.");
			}
		}else {
		    /* Caso não seja um triangulo */
			System.out.println("Não é um triangulo.");
		}
	}

}
