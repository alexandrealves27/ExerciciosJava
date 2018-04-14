/* Autor: Alexandre Alves
 * 7º Semestre - Sistemas de Informação
 *  Mobile - 2018
 *  http://www.aldohenrique.com.br/
 */
import java.util.Scanner;
public class Lista3_Atividade10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Entrada de dados
        System.out.println("Digite um número: ");
        int num = in.nextInt();

        for (int j = 1; j <= num; j++) { //for que vai contar até o número digitado
            int contador = 0;

            for (int i = 1; i <= num; i++) { //for que vai testar o "i" do primeiro for
                if (j % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(j); //imprimindo dados
            }
        }

    }
}
