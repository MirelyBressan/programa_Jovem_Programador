/**Faça um algoritmo que leia as 3 notas de um aluno e calcule a média
ponderada deste aluno. Considerar que a média é ponderada e que o peso das
notas é: 2,3 e 5, respectivamente.**/

import java.util.Scanner; 
 
public class atividade02{ 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in); 
        double nota1;
        double nota2;
        double nota3;
        double media;
 
        System.out.print("Nota 1: "); 
        nota1 = leitura.nextDouble(); 
        System.out.print("Nota 2: "); 
        nota2 = leitura.nextDouble(); 
        System.out.print("Nota 3: "); 
        nota3 = leitura.nextDouble(); 
 
        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10; 
 
        System.out.println("Média ponderada: " + media);

        leitura.close();
    } 
} 