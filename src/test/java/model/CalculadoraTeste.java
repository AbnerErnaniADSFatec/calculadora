package model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
public class CalculadoraTeste {
    /**
    @Test public void testSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.soma(1,2));
    }

    @Test public void testSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.subtracao(10,6));
    }

    @ParameterizedTest
    @CsvSource(value={"1:2:3","20:30:50","1:3:4"},delimiter=':')
    public void testSomaParams(int x, int y, int resultado){
        Calculadora calc = new Calculadora();
        assertEquals(resultado, calc.soma(x,y));
    }
    */
    @ParameterizedTest(name="Teste {index} => x = {0} y = {1}," + " resultado = {2}")
    @CsvFileSource(resources="/values.csv",delimiter=',')
    public void testSomaParams(int x, int y, int resultado){
        Calculadora calc = new Calculadora();
        assertEquals(resultado, calc.soma(x,y));
    }
}