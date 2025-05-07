/**Escreva um algoritmo que calcule a soma dos números de 1 a 15.**/


public class atividade01 {
    public static void main(String[] args) throws Exception {
        int i;
        int soma = 0;

        for (i = 1; i <= 15; i++) {
            soma = soma + i;
        }
        
        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}
