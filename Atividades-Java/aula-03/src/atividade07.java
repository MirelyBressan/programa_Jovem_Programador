/**Crie um algoritmo leia um número e exiba a sua tabuada de
 multiplicação. */

import java.util.Scanner;

public class atividade07 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numero;
        int i;

        System.out.print("Digite um número: ");
        numero = leitura.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        leitura.close();
    }

}
