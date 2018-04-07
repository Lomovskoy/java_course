package consolcalc;

import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Тестирование класса калькулятор
 * @author lomov
 */
public class CalculatorTest {

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Calculator calc = new Calculator();
        double first = 1.0;
        double second = 1.0;
        calc.add(first, second);
        double result = calc.result();
        assertThat(result, is(2D));
    }

    /**
     * Test of div method, of class Calculator.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        Calculator calc = new Calculator();
        double first = 6.0;
        double second = 3.0;
        calc.div(first, second);
        double result = calc.result();
        assertThat(result, is(2D));
    }

    /**
     * Test of expand method, of class Calculator.
     */
    @Test
    public void testExpand() {
        System.out.println("expand");
        double first = 2.0;
        int second = 4;
        Calculator calc = new Calculator();
        calc.expand(first, second);
        double result = calc.result();
        assertThat(result, is(32D));
    }

    /**
     * Test of substract method, of class Calculator.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        double first = 4.0;
        double second = 2.0;
        Calculator calc = new Calculator();
        calc.substract(first, second);
        double result = calc.result();
        assertThat(result, is(2D));
    }

    /**
     * Test of multiple method, of class Calculator.
     */
    @Test
    public void testMultiple() {
        System.out.println("multiple");
        double first = 2.0;
        double second = 4.0;
        Calculator calc = new Calculator();
        calc.multiple(first, second);
        double result = calc.result();
        assertThat(result, is(8D));
    }
    
}
