/**Faça um algoritmo que leia 10 números e, ao final, escreva
 quantos estão entre 0 e 100. */

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um número: ");
            int number = leitura.nextInt();

            if (number >= 0 && number <= 100) {
                count++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + count);
        
        leitura.close();
    }

}
