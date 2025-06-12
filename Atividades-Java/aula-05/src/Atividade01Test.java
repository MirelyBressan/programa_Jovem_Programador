import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Atividade01Test {
    @Test
    void testVerificaParOuImpar() {
        assertEquals("par", atividade01.verificaParOuImpar(2));
        assertEquals("ímpar", atividade01.verificaParOuImpar(3));
        assertEquals("par", atividade01.verificaParOuImpar(0));
        assertEquals("ímpar", atividade01.verificaParOuImpar(-1));
    }
}
