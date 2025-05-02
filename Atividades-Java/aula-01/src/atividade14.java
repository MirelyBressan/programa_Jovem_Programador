/**A padaria Hotpão vende uma certa quantidade de pães franceses e uma
quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$
1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães
e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total
arrecadado). Você foi contratado para fazer os cálculos para o dono. Com
base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas,
e depois calcular os dados solicitados.**/

import java.util.Scanner; 
 
public class atividade14{ 
    public static void main(String[] args) { 
        
        Scanner leitura = new Scanner(System.in); 
        int paes;
        int broas; 
        double total;
        double poupanca; 
 
        System.out.print("Quantidade de pães: "); 
        paes = leitura.nextInt(); 
        System.out.print("Quantidade de broas: "); 
        broas = leitura.nextInt(); 
 
        total = (paes * 0.12) + (broas * 1.50); 
        poupanca = total * 0.10; 
 
        System.out.println("Total arrecadado: R$ " + total); 
        System.out.println("Guardar na poupança: R$ " + poupanca); 

        leitura.close();
    } 
}