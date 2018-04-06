/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */

import java.util.Scanner;
public class Lista3_Atividade7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Declarando variáveis */
        int alunos = 0;
        double mediaFinal = 0;
        double maior = 0;
        double menor = 9999;

        for (int i = 1; i>0;i++) {
            /*Entrada de dados */
            System.out.println("Digite a media do aluno:");
            double media = in.nextDouble();
            /*contador de alunos */
            alunos = alunos + 1 ;
            /*somando as notas*/
            mediaFinal = mediaFinal + media;
            /*pegando a maior nota*/
            if(media>maior){
                maior = media;
            } /*pegando a menor nota*/
            if(media<menor){
                menor = media;
            }/* condicao de saida do programa*/
            if(media<0){
                i = -1;
            }
        }
        /*calculando a media (soma da media de todos os alunos e dividindo pelo número de alunos) */
        mediaFinal = mediaFinal/alunos;
        /*saida de dados */
        System.out.println("Media final dos alunos: "+mediaFinal);
        System.out.println("Maior media: "+maior);
        System.out.println("Menor media: "+menor);
    }
}
