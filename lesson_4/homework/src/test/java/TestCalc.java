import implement.Calculate;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalc {

    /**
     * Тест сложения
     */
    @Test
    public void testSumm(){
        Calculate calc = new Calculate();
        Double summ = calc.summ(2.0, 2.0);
        Double res = 4.0;
        assertEquals(summ, res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Темст вычитания
     */
    @Test
    public void testSubtract(){
        Calculate calc = new Calculate();
        Double summ = calc.subtract(2.0, 2.0);
        Double res = 0.0;
        assertEquals(summ, res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Тест умножения
     */
    @Test
    public void testMultiply(){
        Calculate calc = new Calculate();
        Double summ = calc.multiply(2.0, 3.0);
        Double res = 6.0;
        assertEquals(summ, res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Тест деления
     */
    @Test
    public void testShare(){
        Calculate calc = new Calculate();
        Double summ = calc.share(6.0, 3.0);
        Double res = 2.0;
        assertEquals(summ, res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Тест возведения в степень
     */
    @Test
    public void testDegreeOf(){
        Calculate calc = new Calculate();
        Double summ = calc.degreeOf(6.0, 2.0);
        Double res = 36.0;
        assertEquals(summ, res);
        //fail("Тест сложения не пройден.");
    }
}
