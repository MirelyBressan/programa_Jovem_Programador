import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exemplo01 {

    public static void main(String[] args) throws Exception {
        
        Scanner leitura = new Scanner(System.in);
        int numero;
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i=0; i<10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numero = leitura.nextInt();
            numeros.add(numero);
        }

        Collections.sort(numeros); // Ordena os números

        System.out.println("Números ordenados: " + numeros);

    }

}
