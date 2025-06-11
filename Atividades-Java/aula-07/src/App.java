import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> aulas = new ArrayList<>();

        String aula1 = "Programação";
        String aula2 = "Banco de Dados";
        String aula3 = "Qualidade de Software";

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
       //aulas.remove(1);

       for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        System.out.println("Aula: " + aulas.get(1));

        Collections.sort(aulas); // Ordena as aulas
        Collections.reverse(aulas); // Inverte a ordem
    }
}
