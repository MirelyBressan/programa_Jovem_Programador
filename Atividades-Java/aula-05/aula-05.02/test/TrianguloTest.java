import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrianguloTest {
    @Test
    void testCalcularArea() {
        Triangulo t = new Triangulo();
        t.base = 6;
        t.altura = 4;
        assertEquals(12.0, t.calcularArea(), 0.0001);
    }
}
