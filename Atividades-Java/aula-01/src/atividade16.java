/**Alguns países medem temperaturas em graus Celsius, e outros em graus
Fahrenheit. Faça um algoritmo para ler uma temperatura Celsius e imprimi-Ia em
Fahrenheit (pesquise como fazer este tipo de conversão).**/

import java.util.Scanner; 
 
public class atividade16 { 
    public static void main(String[] args) { 

        Scanner leitura = new Scanner(System.in); 
        double celsius;
        double fahrenheit; 
 
        System.out.print("Digite a temperatura em Celsius: "); 
        celsius = leitura.nextDouble(); 
 
        fahrenheit = (celsius * 9/5) + 32; 
 
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit); 

        leitura.close();
    } 
}