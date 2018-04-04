/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
public class Lista2_Atividade3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/* Entrada de dados */
		System.out.println("Digite a primeira nota: ");
		float nota1 = in.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = in.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = in.nextFloat();

		/* Calculando media */
	double media = (nota1+nota2+nota3)/3;
	/* SE nota 1 for maior imprime a nota */
	if(nota1 > nota2 && nota1>nota3){
		float mais = nota1;
		System.out.println("Maior nota:"+mais + " Media: "+media);	
	}else
	    /* SE nota 2 for maior imprime a nota */
	    if(nota2 > nota1 && nota2>nota3){
		float mais = nota2;
		System.out.println("Maior nota:"+mais + " Media: "+media);
	}else
	    /* SE nota 3 for maior imprime a nota */
	    if(nota3 > nota2 && nota3>nota1){
		float mais = nota3;
		System.out.println("Maior nota:"+mais + " Media: "+media);
	}

	
	
	
	}
}
