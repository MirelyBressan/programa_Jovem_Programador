import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuadradoTest {
    @Test
    void testCalcularArea() {
        Quadrado q = new Quadrado();
        q.base = 4;
        q.altura = 5;
        assertEquals(20.0, q.calcularArea(), 0.0001);
    }
}
