package calcularIngresso;

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

