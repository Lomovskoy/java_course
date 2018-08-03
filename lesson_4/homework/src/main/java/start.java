import implement.Calculate;

public class start {

    /**
     * Главный класс запуска программы
     * @param args
     */
    public static void main(String[] args){

        Calculate calc = new Calculate();

        calc.choice(Double.valueOf(args[0]), Double.valueOf(args[1]), args[2]);
    }
}
