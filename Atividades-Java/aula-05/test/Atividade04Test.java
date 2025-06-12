import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Atividade04Test {
    @Test
    void testEhBissexto() {
        assertTrue(atividade04.ehBissexto(2020));
        assertFalse(atividade04.ehBissexto(2019));
        assertTrue(atividade04.ehBissexto(2000));
        assertFalse(atividade04.ehBissexto(1900));
    }
}
