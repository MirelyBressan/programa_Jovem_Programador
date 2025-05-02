/**Construir um programa que leia um valor numérico inteiro e apresente como
resultado os seus valores: sucessor e antecessor.**/

import java.util.Scanner; 
 
public class at { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        int numero; 
 
        System.out.print("Digite um número: "); 
        numero = input.nextInt(); 
 
        System.out.println("Antecessor: " + (numero - 1)); 
        System.out.println("Sucessor: " + (numero + 1)); 
    } 
} 
