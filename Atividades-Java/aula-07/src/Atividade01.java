/**1. Números pares
Peça para o usuário digitar 10 números inteiros e armazene-os em um
ArrayList. Depois, mostre apenas os números pares*/

import java.util.Scanner;
import java.util.ArrayList;


public class Atividade01 {

    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicita ao usuário que digite 10 números inteiros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = leitura.nextInt();
            numeros.add(numero);
        }
        System.out.println("Números pares digitados:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
        leitura.close();
    }
}
