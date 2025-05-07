/**Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa
mais nova. */

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        int i;
        int idade;
        String nome;
        String nomeMaisNovo = "";
        int idadeMaisNova = 150; // Inicializando com um valor maior que 150 para garantir que qualquer idade válida seja menor.

        for (i=0; i<10; i++) {
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa: ");
            nome = leitura.nextLine();
            System.out.println("Digite a idade da " + (i+1) + "ª pessoa: ");
            idade = Integer.parseInt(leitura.nextLine()); // Corrigido para usar nextLine() e depois converter para inteiro.
            

            if (i == 0 || idade < idadeMaisNova) {
                nomeMaisNovo = nome;
                idadeMaisNova = idade;
            }
        }
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo + " com " + idadeMaisNova + " anos.");

        leitura.close();

        }
    
}
