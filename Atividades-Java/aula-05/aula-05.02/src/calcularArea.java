import java.util.Scanner;

public class calcularArea {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o valor da base: ");
        quadrado.base = leitura.nextDouble();
        triangulo.base = quadrado.base; // Usando a mesma base para o triângulo

        System.out.println("Digite o valor da altura: ");
        quadrado.altura = leitura.nextDouble();
        triangulo.altura = quadrado.altura; // Usando a mesma altura para o triângulo

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

         leitura.close();
    }
}

        
