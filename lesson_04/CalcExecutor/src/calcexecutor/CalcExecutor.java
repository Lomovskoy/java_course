package calcexecutor;
/**
 * Консольный калькулятор
 * @author lomov
 * @since 17.03.2018
 */
public class CalcExecutor {

    public static void main(String[] args) {
        final Calculator calculator = new Calculator();
        calculator.calc(
                args[1], 
                Double.valueOf(args[0]), 
                Double.valueOf(args[2])
        );
        System.out.println(String.format(
                "%s %s %s = %s", 
                args[0], args[1], args[2],
                calculator.result)
        );

    }

}
