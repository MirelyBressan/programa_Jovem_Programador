/**Implemente um método chamado calculaIMC(double peso, double altura) que
retorne o valor do IMC.
No main, receba os valores do usuário e imprima o IMC calculado.
Opcional: crie outro método classificaIMC(double imc) que retorna a
classificação ("Abaixo do peso", "Normal", "Sobrepeso", etc.) */

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        
        double imc = calculaIMC(peso, altura);
        System.out.printf("O IMC calculado é: %.2f%n", imc);
        
        String classificacao = classificaIMC(imc);
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
    
    public static double calculaIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public static String classificaIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}

