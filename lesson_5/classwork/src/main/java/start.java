import implement.Calculate;
import interfaces.ICalculate;

/**
 * Главный гласс программы для запуска приложения
 * @author lomov
 * @since 05.08.2018
 * @version 3.0
 */
public class start {

    /**
     * Главный класс запуска программы с консольными данными
     * @param args
     */
    public static void main(String[] args){

        ICalculate calc = new Calculate();

        calc.choice(Double.valueOf(args[0]), Double.valueOf(args[1]), args[2]);
    }
}
