package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    @Test public void testSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.Soma(1,2));
    }
}
