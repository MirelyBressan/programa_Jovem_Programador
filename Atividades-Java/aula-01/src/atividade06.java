/**Ler dois valores para as variáveis A e B e efetuar a troca dos valores de forma
que a variável A passe a possuir o valor da variável B e a variável B passe a
possuir o valor da variável A. Apresentar os valores após a efetivação do
processamento da troca.**/

import java.util.Scanner; 
 
public class atividade06{ 
    public static void main(String[] args) {
         
        Scanner leitura = new Scanner(System.in); 
        int A;
        int B;
        int temp; 
 
        System.out.print("Digite A: "); 
        A = leitura.nextInt(); 
        System.out.print("Digite B: "); 
        B = leitura.nextInt(); 
 
        temp = A; 
        A = B; 
        B = temp; 
 
        System.out.println("Após troca: A = " + A + ", B = " + B); 
    } 
} 