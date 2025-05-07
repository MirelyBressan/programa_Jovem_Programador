import java.util.Scanner;

/**Escreva um algoritmo que leia 10 números do usuário e exiba
 quantos números são pares. */


public class atividade04 {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        int i;
        int numero;
        int contagemPares = 0;

        for (i=0; i<10; i++) {
            
            System.out.println("Digite o " + (i+1) + "º número: ");
            numero = leitura.nextInt();

            if (numero % 2 == 0) {
                contagemPares++;
            }
        }
        System.out.println("A quantidade de números pares é: " + contagemPares);

        leitura.close();

    }

}
