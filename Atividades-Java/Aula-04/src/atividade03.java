/** solicitar dois números para o usuario e uma opção de cálculo
 * (soma, subtração, divisão e multiplicação). Criar métodos que executam os cálculos
 * e mostre o resultados e ao final mostre uma mensagem de "Operação Concluida" dentro de um método
 * void */


import java.util.Scanner;

public class atividade03 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double n1;
        double n2;
        String opcao;

        System.out.println("Informe o primeiro número: ");
        n1 = leitura.nextDouble();
        System.out.println("Informe o segundo número: ");
        n2 = leitura.nextDouble();
        System.out.println("Informe a operação desejada: A - Adição ou S - Subtração ou M - Multiplicação ou D - Divisão");
        opcao = leitura.nextLine();
        
        
        if(opcao == "A"){
            soma(n1, n2);
        } else if(opcao == "S"){
            subtracao(n1, n2);
        } else if(opcao == "M"){
            multiplicacao(n1, n2);
        } else if(opcao == "D"){
            divisao(n1, n2);
        } else {
            System.out.println("Opção inválida");
        }

        mostraMensagem();

    }

    public static void soma(double n1, double n2){
        System.out.println("Resultado: " + (n1 + n2));
    }
     public static void subtracao(double n1, double n2){
        System.out.println("Resultado: " + (n1 - n2));
    }
     public static void multiplicacao(double n1, double n2){
        System.out.println("Resultado: " + (n1 * n2));
    }
     public static void divisao(double n1, double n2){
        System.out.println("Resultado: " + (n1 /n2));
    }
     public static void mostraMensagem(){
        System.out.println("Operação concluída!");
    }
}
