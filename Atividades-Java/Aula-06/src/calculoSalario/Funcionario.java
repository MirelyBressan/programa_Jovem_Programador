/**Classe Funcionario:
Atributos: nome, salarioBase, bonusPercentual.
Método: calculaSalarioFinal(). */

package calculoSalario;

public class Funcionario {
    
    String nome;
    double salarioBase;
    double bonusPercentual;

    public double calculaSalarioFinal() {
        double bonus = salarioBase * (bonusPercentual / 100);
        return salarioBase + bonus;
    }
}
