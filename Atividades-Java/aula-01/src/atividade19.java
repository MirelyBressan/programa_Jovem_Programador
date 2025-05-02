/**Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais
conseguiu poupar. Faça um algoritmo para ler a quantidade de cada tipo de
moeda, e imprimir o valor total economizado, em reais. Considere que existam
moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real. Não havendo
moeda de um tipo, a quantidade respectiva é zero.**/

import java.util.Scanner; 
 
public class atividade19 { 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in); 
        int m1, m5, m10, m25, m50, m100; 
        double total; 
 
        System.out.print("Moedas de 1 centavo: "); 
        m1 = leitura.nextInt(); 
        System.out.print("Moedas de 5 centavos: "); 
        m5 = leitura.nextInt(); 
        System.out.print("Moedas de 10 centavos: "); 
        m10 = leitura.nextInt(); 
        System.out.print("Moedas de 25 centavos: "); 
        m25 = leitura.nextInt(); 
        System.out.print("Moedas de 50 centavos: "); 
        m50 = leitura.nextInt(); 
        System.out.print("Moedas de 1 real: "); 
        m100 = leitura.nextInt(); 
 
        total = (m1 * 0.01) + (m5 * 0.05) + (m10 * 0.10) + (m25 * 0.25) + 
                (m50 * 0.50) + (m100 * 1.00); 
 
        System.out.println("Total economizado: R$ " + total); 

        leitura.close();
    } 
}
