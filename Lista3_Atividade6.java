/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
public class Lista3_Atividade6 {


    public static void main(String[] args){
        // Declarando variáveis
        int opc = 0;

        // Estrutura de repetição
        while(opc == 0){
            Scanner in = new Scanner(System.in);

            //Entrada de dados
            System.out.println("Digite o primeiro número: ");
            float num1 = in.nextFloat();
            System.out.println("Digite o segundo número: ");
            float num2 = in.nextFloat();
            System.out.println("Digite o terceiro número: ");
            float num3 = in.nextFloat();

            //Condição para ver quais números são maiores
            if((num3>num2)&&(num3>num1)&&(num2>num1)){
                // calculos
                float soma = num1+num2+num3;
                float produto = num1*num2*num3;
                float media = soma/3;
                //Saida de dados
                System.out.println("SOMA: "+soma);
                System.out.println("PRODUTO: "+produto);
                System.out.println("MEDIA: "+media);

            }else{
                System.out.println("ADEUS!");
                // Condição para a saída do programa
                opc = 1;
            }
        }
    }


}
