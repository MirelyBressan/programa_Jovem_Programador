import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExemploMetodoTest {
    @Test
    void testSubtracao() {
        assertEquals(20, exemploMetodo.subtracao(100, 80));
        assertEquals(-10, exemploMetodo.subtracao(10, 20));
    }
}
