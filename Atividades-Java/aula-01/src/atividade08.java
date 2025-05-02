/**Ler dois valores numéricos inteiros (representados pelas variáveis A e B) e
apresentar o resultado do quadrado da diferença do primeiro valor (variável A)
em relação ao segundo valor (variável B).**/

import java.util.Scanner; 
 
public class atividade08{ 
    public static void main(String[] args) { 
        
        Scanner leitura = new Scanner(System.in); 
        int A; 
        int B;
        int resultado; 
 
        System.out.print("Digite A: "); 
        A = leitura.nextInt(); 
        System.out.print("Digite B: "); 
        B = leitura.nextInt(); 
 
        resultado = (A - B) * (A - B); 
 
        System.out.println("Quadrado da diferença: " + resultado); 
    } 
}