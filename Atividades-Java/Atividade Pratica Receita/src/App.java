public class App {
    public static void main(String[] args) throws Exception {
        Ingrediente agua = new Ingrediente();
        Ingrediente lupulo = new Ingrediente();
        Ingrediente malte = new Ingrediente();
        Receita minhaReceita = new Receita();
        Cerveja minhaCerveja = new Cerveja();

        agua.nome = "Água";
        agua.quantidade = 20.0;

        lupulo.nome = "Lúpulo";
        lupulo.quantidade = 0.5;

        malte.nome = "Malte";
        malte.quantidade = 5.0;

        minhaReceita.nome = "Cerveja Artesanal";
        minhaReceita.adicionarIngrediente(malte);
        minhaReceita.adicionarIngrediente(agua);
        minhaReceita.adicionarIngrediente(lupulo);

        minhaCerveja.nome = "Cerveja Artesanal";
        minhaCerveja.receita = minhaReceita;

        System.out.println("Informações da Cerveja:");
        System.out.println("Nome: " + minhaCerveja.nome);
        System.out.println("Volume: " + minhaCerveja.volumeLitros);
        System.out.println("Receita: " + minhaCerveja.receita.nome);
        System.out.println("Ingredientes:");
        for (Ingrediente ingrediente : minhaReceita.ingredientes) {
            System.out.println("- " + ingrediente.nome + ": " + ingrediente.quantidade + " kg");
        }


    }
}
