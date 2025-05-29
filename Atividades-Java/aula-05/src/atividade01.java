/** Crie um método chamado verificaParOuImpar(int numero) que receba um número
inteiro e retorne se ele é par ou ímpar.
No método principal (main), peça ao usuário um número, chame o método e exiba
o resultado. */

import java.util.Scanner;

public class atividade01 {
    // Método que verifica se o número é par ou ímpar
    public static String verificaParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado = verificaParOuImpar(numero);
        System.out.println("O número " + numero + " é " + resultado + ".");

        scanner.close();
    }
}

