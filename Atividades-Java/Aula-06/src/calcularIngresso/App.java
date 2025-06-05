/**Atividade: Sistema de Ingresso para Evento
Classe Ingresso:
Atributos: tipo, preco.
Método: calculaDesconto(), que retorna o valor com desconto de 50% se o
tipo for "estudante".
Na principal: Solicitar o tipo de ingresso e valor. Mostrar o valor
final com ou sem desconto. */
package calcularIngresso;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitura = new Scanner(System.in);
        Ingresso ingresso = new Ingresso(); /**Cria um objeto Ingresso, Iniciando com letra maiúscula é a classe, com a letra minuscula é o objeto */ 

        System.out.println("Informe o valor do ingresso: ");
        ingresso.preco = leitura.nextDouble(); /**Atribui o valor do ingresso ao atributo preco do objeto ingresso */

        System.out.println("Informe o tipo de ingresso: 1- Normal, 2- Estudante");
        ingresso.tipo = leitura.nextInt(); /**Atribui o valor do tipo de ingresso ao atributo tipo do objeto ingresso */


        System.out.println("Valor final do ingresso: " + ingresso.CalculaDesconto()); /**Chama o método CalculaDesconto do objeto ingresso e exibe o valor final do ingresso com ou sem desconto */
        leitura.close(); /**Fecha o scanner para evitar vazamento de recursos */
    }
}
