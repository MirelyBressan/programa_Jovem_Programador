/**Faça um algoritmo que leia 10 números e, ao final, escreva
 quantos estão entre 0 e 100, quantos estão entre 101 e 200 e
 quantos são maiores de 200. */

import java.util.Scanner;

public class atividade06 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int count0_100 = 0;
        int count101_200 = 0;
        int countMaior200 = 0;
        int number;

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite um número: ");
            number = leitura.nextInt();

            if (number >= 0 && number <= 100) {
                count0_100++;
            } else if (number >= 101 && number <= 200) {
                count101_200++;
            } else {
                countMaior200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + count0_100);
        System.out.println("Quantidade de números entre 101 e 200: " + count101_200);
        System.out.println("Quantidade de números maiores que 200: " + countMaior200);

        leitura.close();
    }

}
