/**Classe Livro:
Atributos: titulo, autor, anoPublicacao.
Método: exibirInformacoes(). */


package cadastroLivro;

public class Livro {
    
    String titulo;
    String autor;
    int anoPublicacao;

    // Método para exibir as informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

}
