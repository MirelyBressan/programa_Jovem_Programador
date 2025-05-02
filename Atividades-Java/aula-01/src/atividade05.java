/**Um dos sócios da empresa XYZ LTDA ficou sabendo que você desenvolveu
um programa de reajuste salarial para a empresa ABC LTDA e pediu que você
desenvolva um programa similar. Na verdade, ele está pedindo que você
acrescente ao programa anterior à possibilidade dele informar não somente o
salário atual do funcionário, mas também o valor percentual que deve ser
incrementado para aquele funcionário, pois ele irá aplicar valores percentuais
diferentes a cada funcionário.**/

import java.util.Scanner; 
 
public class atividade05{ 
    public static void main(String[] args) {
         
        Scanner leitura = new Scanner(System.in); 
        double salario;
        double percentual;
        double novoSalario; 
 
        System.out.print("Salário atual: "); 
        salario = leitura.nextDouble(); 
 
        System.out.print("Percentual de aumento (%): "); 
        percentual = leitura.nextDouble(); 
 
        novoSalario = salario + (salario * (percentual / 100)); 
 
        System.out.println("Novo salário: R$ " + novoSalario); 

        leitura.close();
    } 
}