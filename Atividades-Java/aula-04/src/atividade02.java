/** Crie um programa que peça ao usuario a temperatura em celsius e depois retorne o valor em fahrenheit ou kelvin */

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double temperatura;
        int opcaoTemp;

        System.out.println("Informe a temperatura em Celsius: ");
        temperatura = leitura.nextDouble();

        System.out.println("Informe a opção desejada: 1 - Fahrenheit ou 2 - Kelvin");
        opcaoTemp = leitura.nextInt();

        System.out.println("Temperatura: " + converteTemperatura(temperatura, opcaoTemp));
    }
    public static double converteTemperatura(double tempCelsius, int opcao){
        double resultado = 0;
        if (opcao == 1) {
            resultado =  (tempCelsius * 9/5) + 32;
        } else if (opcao == 2) {
            resultado = tempCelsius + 273.15;
        }
        return resultado;
    }
}
