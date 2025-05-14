/**Solicite um nome e o gênero e depois retorne o nome e o seu gênero */

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        String genero;

        System.out.println("Informe o nome: ");
        nome = leitura.nextLine();
        System.out.println("Informe o genero F ou M: ");
        genero = leitura.nextLine();

        System.out.println("Nome: " + nome);
        verificaGenero(genero);
    }

    public static void verificaGenero(String sexo){
        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Genero Invalido");
        }
    }
}
