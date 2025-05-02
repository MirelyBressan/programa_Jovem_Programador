/**O custo ao consumidor de um carro novo é a soma do custo de fábrica com
os impostos (aplicado ao custo de fábrica). Supondo que a porcentagem dos
impostos seja de 45%, escrever um algoritmo que leia o custo de fábrica de um
carro e escreva o custo final ao consumidor.**/

import java.util.Scanner; 
 
public class atividade03 { 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in); 
        double custoFabrica, custoFinal; 
 
        System.out.print("Custo de fábrica: "); 
        custoFabrica = leitura.nextDouble(); 
 
        custoFinal = custoFabrica + (custoFabrica * 0.45); 
 
        System.out.println("Custo final ao consumidor: R$ " + custoFinal); 
    } 
}