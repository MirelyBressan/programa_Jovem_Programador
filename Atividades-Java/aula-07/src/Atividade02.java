/**Soma dos elementos
Armazene 6 números inteiros em um ArrayList e calcule a soma de todos os
elementos.*/

import java.util.Scanner;
import java.util.ArrayList;

public class Atividade02 {

    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        // Solicita ao usuário que digite 6 números inteiros
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = leitura.nextInt();
            numeros.add(numero);
            soma += numero; // Acumula a soma dos números
        }

        System.out.println("A soma dos números digitados é: " + soma);
        leitura.close();
    }

}
