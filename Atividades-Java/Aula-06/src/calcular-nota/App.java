import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = leitura.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        aluno.nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        aluno.nota2 = leitura.nextDouble();

        System.out.println("O aluno "+ aluno.nome + " com a média de " + aluno.calculaMedia() + ". \nSituação: " + aluno.verificaAprovacao());
    }

}
