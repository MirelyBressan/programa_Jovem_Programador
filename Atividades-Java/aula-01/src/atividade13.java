/**A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo
para ler as dimensões de um terreno e depois exibir a área do terreno.**/

import java.util.Scanner; 
 
public class atividade13 {
    public static void main(String[] args) {
         
        Scanner leitura = new Scanner(System.in); 
        double largura;
        double comprimento;
        double area; 
 
        System.out.print("Largura do terreno: "); 
        largura = leitura.nextDouble(); 
        System.out.print("Comprimento do terreno: "); 
        comprimento = leitura.nextDouble(); 
 
        area = largura * comprimento; 
 
        System.out.println("Área do terreno: " + area); 
        
        leitura.close();
    } 
}