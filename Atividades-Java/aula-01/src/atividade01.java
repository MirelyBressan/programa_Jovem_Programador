/**Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final.**/

import java.util.Scanner; 
 
public class atividade01{ 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in);         
        double nota1;
        double nota2;
        double nota3;
        double media; 
 
        System.out.print("Digite a primeira nota: "); 
        nota1 = leitura.nextDouble(); 
        System.out.print("Digite a segunda nota: "); 
        nota2 = leitura.nextDouble(); 
        System.out.print("Digite a terceira nota: "); 
        nota3 = leitura.nextDouble(); 
 
        media = (nota1 + nota2 + nota3) / 3; 
 
        System.out.println("A média final é: " + media); 
    } 
} 