/**faça um algoritmo que leia o nome, o gênero e o salário de 5 funcionários
 * e guarde esses dados em três listas. No final, mostre uma listagem contendo
 * apenas os dados das funcionárias mulheres que ganham mais de R$5.000,00. */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;



public class Exemplo02 {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        String nome, genero;
        double salario;
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> generos = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            nome = leitura.nextLine();
            nomes.add(nome);

            System.out.print("Digite o gênero do funcionário " + (i + 1) + " (M/F): ");
            genero = leitura.nextLine();
            generos.add(genero);

            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salario = leitura.nextDouble();
            salarios.add(salario);
            leitura.nextLine(); // Limpa o buffer do scanner
        }

        System.out.println("\nFuncionárias mulheres com salário acima de R$5.000,00: ");
        for (int i = 0; i < nomes.size(); i++) {
            if (generos.get(i).equalsIgnoreCase("F") && salarios.get(i) > 5000) {
                System.out.println("Nome: " + nomes.get(i) + ", Gênero: " + generos.get(i) + ", Salário: R$" + salarios.get(i));
            }
        }
        leitura.close();
    }
}
