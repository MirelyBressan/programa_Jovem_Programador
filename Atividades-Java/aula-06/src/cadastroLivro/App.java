/**Atividade: Cadastro de Livro
Classe Livro:
Atributos: titulo, autor, anoPublicacao.
Método: exibirInformacoes().
Na principal: Criar um ou dois objetos Livro, preencher os dados via
Scanner e exibir as informações. */

package cadastroLivro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        // Preenchendo os dados do livro1
        System.out.println("Informe o título do livro: ");
        livro1.titulo = leitura.nextLine();

        System.out.println("Informe o autor do livro: ");
        livro1.autor = leitura.nextLine();

        System.out.println("Informe o ano de publicação do livro: ");
        livro1.anoPublicacao = leitura.nextInt();

        leitura.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Informe o título do segundo livro: ");
        livro2.titulo = leitura.nextLine();

        System.out.println("Informe o autor do segundo livro: ");
        livro2.autor = leitura.nextLine();

        System.out.println("Informe o ano de publicação do segundo livro: ");
        livro2.anoPublicacao = leitura.nextInt();

        // Exibindo as informações dos livros
        System.out.println("\nInformações do primeiro livro:");
        livro1.exibirInformacoes();

        System.out.println("\nInformações do segundo livro:");
        livro2.exibirInformacoes();

        // Fechando o scanner
        leitura.close();


    }
}
