import java.util.ArrayList;
import java.util.Arrays;

public class Receita {
    String nome;
    ArrayList<Ingrediente> ingredientes = new ArrayList<>();
   
   public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

}