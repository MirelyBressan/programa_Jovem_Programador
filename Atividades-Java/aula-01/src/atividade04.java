/**O proprietário da empresa ABC LTDA precisa de um programa de
computador para calcular o novo salário que seus funcionários irão receber a
partir do mês que vem. Sabendo que o aumento de salário para todos os
funcionários será de 25%, faça um programa que lê o valor do salário atual do
funcionário e informa o seu novo salário acrescido de 25%.**/

import java.util.Scanner; 
 
public class atividade04{ 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in); 
        double salario;
        double novoSalario; 
 
        System.out.print("Salário atual: "); 
        salario = leitura.nextDouble(); 
 
        novoSalario = salario * 1.25; 
 
        System.out.println("Novo salário: R$ " + novoSalario); 
    } 
}