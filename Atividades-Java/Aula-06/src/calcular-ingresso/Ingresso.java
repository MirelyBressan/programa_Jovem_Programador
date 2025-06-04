/**Classe Ingresso:
Atributos: tipo, preco.
Método: calculaDesconto(), que retorna o valor com desconto de 50% se o
tipo for "estudante". */

public class Ingresso{
    int tipo;
    double preco;

    public double CalculaDesconto() {
        if (tipo == 2){
            return preco * 0.5; // Desconto de 50% para estudantes
        } else {
            return preco; // Sem desconto
        } 
    }
}

