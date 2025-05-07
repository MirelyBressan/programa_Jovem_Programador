import java.util.Scanner;

/**Leia a idade de 10 pessoas e exiba quantas pessoas são maiores
 de idade. */

public class atividade02 {
    public static void main(String[] args) throws Exception {
        
        Scanner leitura = new Scanner(System.in);
        int i;
        int idade;
        int qtPessoas = 0;

        for (i=0; i<10; i++) {
            System.out.println("Digite a idade da " + (i+1) + "ª pessoa: ");
            idade = leitura.nextInt();
            if (idade >= 18) {
                qtPessoas++;
            }
        } 
        System.out.println("A quantidade de pessoas maiores de idade é: " + qtPessoas);

        leitura.close();
    }
    

}
