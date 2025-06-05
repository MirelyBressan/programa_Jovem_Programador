/**Atividade: Produto em Estoque
Classe Produto:
Atributos: nome, quantidade, preco.
Métodos: adicionarEstoque(int), removerEstoque(int),
valorTotalEstoque().
Na principal: Criar um produto, fazer movimentações no estoque e mostrar
o valor total. */

package produtoEstoque;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Produto produto = new Produto();

        // Solicita os dados do produto ao usuário
        System.out.print("Digite o nome do produto: ");
        produto.nome = leitura.nextLine();

        System.out.print("Digite a quantidade inicial: ");
        produto.quantidade = leitura.nextInt();

        System.out.print("Digite o preço do produto: ");
        produto.preco = leitura.nextDouble();

        System.out.print("Quantas unidades deseja adicionar ao estoque? ");
        int adicionar = leitura.nextInt();
        produto.adicionarEstoque(adicionar);

        System.out.print("Quantas unidades deseja remover do estoque? ");
        int remover = leitura.nextInt();
        produto.removerEstoque(remover);

        System.out.println("\nResumo do produto:");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Preço: R$" + produto.preco);
        System.out.println("Valor total em estoque: R$" + produto.valorTotalEstoque());

        leitura.close();
    }
}
