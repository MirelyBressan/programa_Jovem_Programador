/**Atividade: Conversor de Temperatura
Classe Temperatura:
Atributo: celsius.
Métodos: paraFahrenheit(), paraKelvin().
Na principal: Ler a temperatura em Celsius, instanciar a classe e exibir
os valores convertidos. */

package conversorTemperatura;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();

        // Solicita ao usuário a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        temperatura.celsius = leitura.nextDouble();


        // Exibe as temperaturas convertidas
        System.out.printf("Temperatura em Fahrenheit: %.2f\n", temperatura.paraFahrenheit());
        System.out.printf("Temperatura em Kelvin: %.2f\n", temperatura.paraKelvin());
        
        leitura.close();
    }
}
