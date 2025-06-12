import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.somar(2, 3), 0.0001);
    }
    @Test
    void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.subtrair(4, 3), 0.0001);
    }
    @Test
    void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6.0, calc.multiplicar(2, 3), 0.0001);
    }
    @Test
    void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(6, 3), 0.0001);
    }
    @Test
    void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}
