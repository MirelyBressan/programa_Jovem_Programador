/**Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir
quantos dias de vida ela possui. Considere sempre anos completos, e que um
ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida; veja
um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS.**/

import java.util.Scanner; 
 
public class atividade15 { 
    public static void main(String[] args) { 
        
        Scanner leitura = new Scanner(System.in); 
        String nome; 
        int idade;
        int dias; 
 
        System.out.print("Digite seu nome: "); 
        nome = leitura.nextLine(); 
        System.out.print("Digite sua idade: "); 
        idade = leitura.nextInt(); 
 
        dias = idade * 365; 
 
        System.out.println(nome.toUpperCase() + ", VOCÊ JÁ VIVEU " + dias + " DIAS."); 

        leitura.close();
    } 
} 