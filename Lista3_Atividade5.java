/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */

import java.util.Scanner;
public class Lista3_Atividade5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*Declaracao das variaveis */
        int par = 0;
        int impar = 0;
        int i = 0;

        /* entrada de dados */
        while (i <= 1000){
            i = in.nextInt();

            /* SE for par irá ser somado aos pares */
            if(i %2 == 0){
                 par = par + i;
            }else
                /* SE não for par será somado aos impares */{
                 impar = impar + i;
            }
        }
        /* Imprimindo na tela a soma ao sair do loop */
        System.out.println("Soma dos Pares:"+ par +"  Soma dos Impares: "+ impar);

    }
}
