import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Atividade02Test {
    @Test
    void testCalculaIMC() {
        assertEquals(25.0, atividade02.calculaIMC(75, 1.73), 0.1);
    }
    @Test
    void testClassificaIMC() {
        assertEquals("Abaixo do peso", atividade02.classificaIMC(17));
        assertEquals("Normal", atividade02.classificaIMC(22));
        assertEquals("Sobrepeso", atividade02.classificaIMC(27));
        assertEquals("Obesidade", atividade02.classificaIMC(32));
    }
}
