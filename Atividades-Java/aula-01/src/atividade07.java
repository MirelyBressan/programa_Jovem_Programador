/**Elaborar um programa que calcule e apresente o valor do volume de uma
caixa retangular, utilizando a fórmula VOLUME <- COMPRIMENTO * LARGURA
* ALTURA.**/

import java.util.Scanner; 
 
public class atividade07{ 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in); 
        double comprimento;
        double largura;
        double altura;
        double volume;
 
        System.out.print("Comprimento: "); 
        comprimento = leitura.nextDouble(); 
        System.out.print("Largura: "); 
        largura = leitura.nextDouble(); 
        System.out.print("Altura: "); 
        altura = leitura.nextDouble(); 
 
        volume = comprimento * largura * altura; 
 
        System.out.println("Volume da caixa: " + volume); 

        leitura.close();
    } 
}