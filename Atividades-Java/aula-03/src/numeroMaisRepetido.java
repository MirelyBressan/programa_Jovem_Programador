/**Escreva um algoritmo que leia 10 números interiros e identifique qual número foi digitado mais vezes.
 * Regras: use apenas vairiaveis simples(int, Scanner, etc), use apenas estrutura for e if, sem listas ou arrays, você
 * pode usar até 3 variaveis de apoio(ex: numeroAtual, maisRepetido, maiorRepeticao) e o número pode se repetir em
 * sequência ou não. Dica: a ideia é que você leia os números 1 por 1 e, a cada leitura, use um segundo for para contar
 * quantas vezes aquele número aparece entre as demais entradas. Mas como só pode usar um único for, a sacada aqui
 * é fazer leituras combinadas com comparações imediatas. */

 import java.util.Scanner;

public class numeroMaisRepetido {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int i;
        int repeticoes = 0;
        int numeroAtual;
        int maisRepetido = 0;
        int maiorRepeticao = 0;

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
        int n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0;

        for (i=1; i<=10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numeroAtual = leitura.nextInt();

            if (i == 1) n1 = numeroAtual;
            if (i == 2) n2 = numeroAtual;
            if (i == 3) n3 = numeroAtual;
            if (i == 4) n4 = numeroAtual;
            if (i == 5) n5 = numeroAtual;
            if (i == 6) n6 = numeroAtual;
            if (i == 7) n7 = numeroAtual;
            if (i == 8) n8 = numeroAtual;
            if (i == 9) n9 = numeroAtual;
            if (i == 10) n10 = numeroAtual;

            repeticoes = 0;
            if (i >= 1 && numeroAtual == n1) repeticoes++;
            if (i >= 2 && numeroAtual == n2) repeticoes++;
            if (i >= 3 && numeroAtual == n3) repeticoes++;
            if (i >= 4 && numeroAtual == n4) repeticoes++;
            if (i >= 5 && numeroAtual == n5) repeticoes++;
            if (i >= 6 && numeroAtual == n6) repeticoes++;
            if (i >= 7 && numeroAtual == n7) repeticoes++;
            if (i >= 8 && numeroAtual == n8) repeticoes++;
            if (i >= 9 && numeroAtual == n9) repeticoes++;
            if (i >= 10 && numeroAtual == n10) repeticoes++;

            if (repeticoes > maiorRepeticao) {
                maiorRepeticao = repeticoes;
                maisRepetido = numeroAtual;
            }
        }

        System.out.println("O número que mais se repetiu foi: " + maisRepetido + " e repetiu " + repeticoes + " vezes.");
    }
}


