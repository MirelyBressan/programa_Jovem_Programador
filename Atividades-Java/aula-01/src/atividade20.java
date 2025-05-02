/**João recebeu seu salário de R$ 1200,00 e precisa pagar duas contas
(C1=R$ 200,00 e C2=R$120,00) que estão atrasadas. Como as contas estão
atrasadas, João terá de pagar multa de 2% sobre cada conta. Faça um algoritmo
que calcule e mostre quanto restará do salário do João.**/

public class atividade20 { 
    public static void main(String[] args) { 
        
        double salario = 1200.00; 
        double conta1 = 200.00; 
        double conta2 = 120.00; 
 
        // Multa de 2% em cada conta 
        conta1 = conta1 + (conta1 * 0.02); 
        conta2 = conta2 + (conta2 * 0.02); 
 
        double restante = salario - conta1 - conta2; 
 
        System.out.println("Valor restante do salário: R$ " + restante); 
    } 
} 