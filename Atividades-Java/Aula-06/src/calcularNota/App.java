/**Atividade: Sistema de Aluno
Classe Aluno:
Atributos: nome, nota1, nota2.
Método: calculaMedia() e opcionalmente verificaAprovacao().
Na principal: Criar um aluno, receber notas e mostrar a média e status
(aprovado/reprovado). */

package calcularNota;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Aluno aluno = new Aluno();

        // Preenchendo os dados do aluno
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = leitura.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        aluno.nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        aluno.nota2 = leitura.nextDouble();

        leitura.close(); // Fecha o scanner para evitar vazamento de recursos
        
        // Exibindo a média e situação do aluno
        System.out.println("O aluno "+ aluno.nome + " com a média de " + aluno.calculaMedia() + ". \nSituação: " + aluno.verificaAprovacao());
    }

}
