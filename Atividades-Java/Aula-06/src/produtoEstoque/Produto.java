/**Classe Produto:
Atributos: nome, quantidade, preco.
Métodos: adicionarEstoque(int), removerEstoque(int),
valorTotalEstoque(). */

package produtoEstoque;

public class Produto {
    public String nome;
    public int quantidade;
    public double preco;

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }

    public double valorTotalEstoque() {
        return this.quantidade * this.preco;
    }
}
