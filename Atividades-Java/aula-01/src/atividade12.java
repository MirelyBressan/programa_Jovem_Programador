/**Construir um programa que leia um valor numérico inteiro e apresente como
resultado os seus valores: sucessor e antecessor.**/

import java.util.Scanner; 
 
public class atividade12{ 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in); 
        int numero; 
 
        System.out.print("Digite um número: "); 
        numero = leitura.nextInt(); 
 
        System.out.println("Antecessor: " + (numero - 1)); 
        System.out.println("Sucessor: " + (numero + 1)); 

        leitura.close();
    } 
} 
