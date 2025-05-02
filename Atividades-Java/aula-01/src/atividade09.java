/**Elaborar um programa que apresente o valor da conversão em real (R$) de
um valor lido em dólar (US$). O programa deve solicitar o valor da cotação do
dólar.**/

import java.util.Scanner; 
 
public class atividade09{ 
    public static void main(String[] args) { 
        
        Scanner leitura= new Scanner(System.in); 
        double valorDolar;
        double cotacao;
        double valorReal; 
 
        System.out.print("Valor em dólar: "); 
        valorDolar = leitura.nextDouble(); 
        System.out.print("Cotação do dólar: "); 
        cotacao = leitura.nextDouble(); 
 
        valorReal = valorDolar * cotacao; 
 
        System.out.println("Valor em reais: R$ " + valorReal); 
    } 
}