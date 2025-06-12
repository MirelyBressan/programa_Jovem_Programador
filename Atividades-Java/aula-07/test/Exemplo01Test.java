import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

public class Exemplo01Test {
    @Test
    void testOrdenacao() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);
        numeros.add(7);
        numeros.add(3);
        numeros.add(8);
        numeros.add(4);
        numeros.add(6);
        numeros.add(0);
        Collections.sort(numeros);
        for (int i = 0; i < numeros.size(); i++) {
            assertEquals(i, numeros.get(i));
        }
    }
}
