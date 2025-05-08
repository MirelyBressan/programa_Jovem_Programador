/**Implemente um algoritmo que leia um número e uma opção de
 listagem. Com base nessa opção, escreva a sequência dos números
 em ordem crescente (de zero até o número) ou decrescente
 (do número até zero).
 1 – CRESCENTE
 2 - DECRESCENTE */

import java.util.Scanner;

public class atividade08 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numero;
        int i;
        int opcao;

        System.out.print("Digite um número: ");
        numero = leitura.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - CRESCENTE");
        System.out.println("2 - DECRESCENTE");
        opcao = leitura.nextInt();

        if (opcao == 1) {
            for (i = 0; i <= numero; i++) {
                System.out.print(i + " ");
            }
        } else if (opcao == 2) {
            for (i = numero; i >= 0; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        leitura.close();
    }

}
