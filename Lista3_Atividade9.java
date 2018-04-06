/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
public class Lista3_Atividade9 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        /* declaração de variáveis */
        int primo;
        int contador = 0;

        /* Entrada de dados */
        System.out.println("Digite um número: ");
        primo = in.nextInt();

        /* dentro do FOR ele vai dividir os números de 1 ao numero digitado para ver se há apenas 2 divisores */
        for(int i=1; i<= primo; i++){

            if (primo % i ==0){
                /* se houver divisão com resto zero adiciona 1 ao contador */
                contador++;
            }

        }
        /* se houver apenas 2 divisores (1 e ele mesmo) imprime o resultado true */
        if(contador == 2)  {
            System.out.println("O número "+ primo +" é primo!");
        }
        /* Se não for apenas 2 então imprime o resultado false */
        else {
            System.out.println("O número "+ primo +" não é primo.");
        }

    }

}