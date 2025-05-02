/**A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e
R$15,00 por hora extra. Faça um algoritmo para calcular e imprimir o salário
bruto e o salário líquido de um determinado funcionário. Considere que o salário
líquido é igual ao salário bruto descontando-se 10% de impostos.**/

import java.util.Scanner; 
 
public class atividade17 { 
    public static void main(String[] args) { 
        
        Scanner leitura = new Scanner(System.in); 
        int horasNormais;
        int horasExtras;
        double salarioBruto;
        double salarioLiquido; 
 
        System.out.print("Horas normais trabalhadas: "); 
        horasNormais = leitura.nextInt(); 
        System.out.print("Horas extras trabalhadas: "); 
        horasExtras = leitura.nextInt(); 
 
        salarioBruto = (horasNormais * 10) + (horasExtras * 15); 
        salarioLiquido = salarioBruto * 0.90; // desconto de 10% 
 
        System.out.println("Salário bruto: R$ " + salarioBruto); 
        System.out.println("Salário líquido: R$ " + salarioLiquido); 

        leitura.close();
    } 
}
