/**Construir um programa que leia três valores numéricos inteiros
(representados pelas variáveis A, B e C) e apresente como resultado final o valor
do quadrado da soma dos três valores lidos.**/

import java.util.Scanner; 
 
public class atividade10{ 
    public static void main(String[] args) { 
        
        Scanner leitura = new Scanner(System.in); 
        int A;
        int B;
        int C;
        int resultado; 
 
        System.out.print("Digite A: "); 
        A = leitura.nextInt(); 
        System.out.print("Digite B: "); 
        B = leitura.nextInt(); 
        System.out.print("Digite C: "); 
        C = leitura.nextInt(); 
 
        resultado = (A + B + C) * (A + B + C); 
 
        System.out.println("Resultado: " + resultado); 
    } 
} 
