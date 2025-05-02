/**A granja Frangotech possui um controle automatizado de cada frango da sua
produção. No pé direito do frango há um anel com um chip de identificação; no
pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve
consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa
R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar
todos os seus frangos.**/

import java.util.Scanner; 
 
public class atividade18 { 
    public static void main(String[] args) {
         
        Scanner leitura = new Scanner(System.in); 
        int quantidadeFrangos; 
        double custoTotal; 
 
        System.out.print("Quantidade de frangos: "); 
        quantidadeFrangos = leitura.nextInt(); 
 
        custoTotal = quantidadeFrangos * (4.00 + 2 * 3.50); 
 
        System.out.println("Custo total para marcar os frangos: R$ " + custoTotal); 

        leitura.close();
    } 
}