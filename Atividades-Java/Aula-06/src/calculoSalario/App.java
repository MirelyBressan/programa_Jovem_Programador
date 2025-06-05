/**Atividade: Cálculo de Salário com Bônus
Classe Funcionario:
Atributos: nome, salarioBase, bonusPercentual.
Método: calculaSalarioFinal().
Na principal: Ler os dados do funcionário e imprimir o salário com bônus
aplicado. */

package calculoSalario;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        // Lê os dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = leitura.nextLine();

        System.out.print("Digite o salário base do funcionário: ");
        funcionario.salarioBase = leitura.nextDouble();

        System.out.print("Digite o percentual de bônus do funcionário: ");
        funcionario.bonusPercentual = leitura.nextDouble();

        // Calcula o salário final
        System.out.println("Funcionário: " + funcionario.nome);
        System.out.printf("Salário final com bônus: R$ %.2f%n", funcionario.calculaSalarioFinal());
        
        leitura.close();

    }

}
