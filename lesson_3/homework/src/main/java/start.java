import implement.Calculate;

public class start {

    /**
     * Главный класс запуска программы
     * @param args
     */
    public static void main(String[] args){

        Calculate calc = new Calculate();

        calc.choice(Integer.valueOf(args[0]), Integer.valueOf(args[1]), args[2]);
    }
}
