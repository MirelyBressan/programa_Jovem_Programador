/**Escreva um método ehBissexto(int ano) que retorna true se o ano for
bissexto e false caso contrário.
No main, peça um ano ao usuário, chame o método e mostre o resultado.*/

import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();
        
        if (ehBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        
        scanner.close();
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}