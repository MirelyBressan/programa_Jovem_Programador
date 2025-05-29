import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        double n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = leitura.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = leitura.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Somar");    
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int operacao = leitura.nextInt();

        double resultado = 0;
        switch (operacao) {
            case 1:
                resultado = calculadora.somar(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calculadora.subtrair(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calculadora.multiplicar(n1, n2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (n2 != 0) {
                    resultado = calculadora.dividir(n1, n2);
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        leitura.close();
    }
}
