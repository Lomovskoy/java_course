import implement.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalc {

    /**
     * Тест сложения
     */
    @Test
    public void testSumm(){
        Calculate calc = new Calculate();
        calc.summ(2.0, 2.0);
        Double res = 4.0;
        assertEquals(calc.getResult(), res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Темст вычитания
     */
    @Test
    public void testSubtract(){
        Calculate calc = new Calculate();
        calc.subtract(2.0, 2.0);
        Double res = 0.0;
        assertEquals(calc.getResult(), res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Тест умножения
     */
    @Test
    public void testMultiply(){
        Calculate calc = new Calculate();
        calc.multiply(2.0, 3.0);
        Double res = 6.0;
        assertEquals(calc.getResult(), res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Тест деления
     */
    @Test
    public void testShare(){
        Calculate calc = new Calculate();
        calc.share(6.0, 3.0);
        Double res = 2.0;
        assertEquals(calc.getResult(), res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Тест возведения в степень
     */
    @Test
    public void testDegreeOf(){
        Calculate calc = new Calculate();
        calc.degreeOf(6.0, 2.0);
        Double res = 36.0;
        assertEquals(calc.getResult(), res);
        //fail("Тест сложения не пройден.");
    }

    /**
     * Тест очистки результата
     */
    @Test
    public void testClearResult(){
        Calculate calc = new Calculate();
        calc.degreeOf(6.0, 2.0);
        Double res = null;
        calc.clearResult();
        assertEquals(calc.getResult(), res);
        //fail("Тест очистки результата не пройден.");
    }

    /**
     * Тест получения действия
     */
    @Test
    public void testGetAction(){
        Calculate calc = new Calculate();
        calc.choice(Double.valueOf(4.9), Double.valueOf(0.9), "1");
        String res = "1";
        assertEquals(calc.getAction(), res);
        //fail("Тест получения действия не пройден.");
    }

    /**
     * Тест очистки действия
     */
    @Test
    public void testClearAction(){
        Calculate calc = new Calculate();
        calc.choice(Double.valueOf(4.9), Double.valueOf(0.9), "1");
        String res = null;
        calc.clearAction();
        assertEquals(calc.getAction(), res);
        //fail("Тест очистки действия не пройден.");
    }
}
