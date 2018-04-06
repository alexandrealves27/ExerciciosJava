/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;

public class Lista3_Atividade8 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*Declarando variáveis */
        int numero;
        int i = 0;
        int j = 0;

        /*Entrada de dados*/
        System.out.println("Digite um numero: ");
        numero = in.nextInt();
        /*contadores */
        /*o valor do cantador é de 0 menos o número digitado */
        i = i-numero;
        j = j-numero;

        /*Mensagem informando o que será impresso */
        System.out.println("Os "+numero+" primeiros pares:");
        while(i<numero){
            i++;
            /* encontrar numeros pares Divisoes por 2 com resto 0 */
            if(i %2 == 0){
                System.out.println(i);
            }

        }
        /*Mensagem informando o que será impresso */
        System.out.println("Os "+numero+" primeiros impares:");
        while(j<numero){
            j++;
            /* encontrar numeros impares Divisoes por 2 com resto diferente de 0 */
            if(j%2 != 0){
                System.out.println(j);
            }
        }
    }
}
