/**Crie um método chamado mostrarTabuada(int numero) que imprima a tabuada de
1 a 10 do número recebido.
No main, solicite um número e chame o método. */

import java.util.Scanner;   

public class atividade03 {  
    
    public static void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        mostrarTabuada(numero);
        scanner.close();
    }

}
