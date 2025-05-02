/**Elaborar um programa que leia dois valores numéricos reais desconhecidos
representados pelas variáveis A e B. Calcular e apresentar os resultados das
quatro operações aritméticas básicas (soma, subtração, divisão e multiplicação).**/

import java.util.Scanner; 
 
public class atividade11{ 
    public static void main(String[] args) { 
        
        Scanner leitura= new Scanner(System.in); 
        double A;
        double B; 
 
        System.out.print("Digite o primeiro número: "); 
        A = leitura.nextDouble(); 
        System.out.print("Digite o segundo número: "); 
        B = leitura.nextDouble(); 
 
        System.out.println("Soma: " + (A + B)); 
        System.out.println("Subtração: " + (A - B)); 
        System.out.println("Multiplicação: " + (A * B)); 
        System.out.println("Divisão: " + (A / B)); 
    } 
}