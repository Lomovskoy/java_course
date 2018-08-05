import implement.Calculate;
import interfaces.ICalculate;
import java.util.Scanner;

/**
 * Главный гласс программы для запуска приложения
 * @author lomov
 * @since 05.08.2018
 * @version 3.0
 */
public class InteractRunner {

    //Поля класса
    Scanner reader;
    ICalculate calculate;
    String choise;
    Double first;
    Double second;

    /**
     * Конструктор
     */
    public InteractRunner() {
        super();
        this.reader = new Scanner(System.in);
        this.calculate = new Calculate();
        this.choise = "";
        this.first = null;
        this.second = null;
    }

    /**
     * Класс с бизнес логикой
     * @param ir
     */
    private void start(InteractRunner ir){

        System.out.println("Добро пожаловать в программу калькулятор");

        while (true){

            calculate.printChose();
            choise = reader.nextLine();

            if(!choise.equals("q")){
                if(choise.equals("1") || choise.equals("2") || choise.equals("3") || choise.equals("4") ||
                        choise.equals("5") || choise.equals("6") || choise.equals("7")){

                    if(choise.equals("6")){
                        ir.previousResult();

                    }else if(choise.equals("7")){
                        calculate.clearResult();
                        System.out.println("Предыдущий результат очищен");

                    }else if(!choise.equals("")){
                        ir.calculatingResult();
                    }
                }else {
                    System.out.println("Вы выбрали неправильный вариант");
                }
            }else {
                break;
            }
        }
        System.out.println("Программа завершена");
    }

    /**
     * Метод вычисления резульата с предыдущим вычислением
     */
    private void previousResult(){
        if(calculate.getResult() != null){
            try {
                calculate.printChose();
                choise = reader.nextLine();
                if(!choise.equals("q")) {
                    if(choise.equals("1") || choise.equals("2") || choise.equals("3") || choise.equals("4") ||
                            choise.equals("5") || choise.equals("6") || choise.equals("7")){
                        System.out.println("Предыдуший результат: " + calculate.getResult());
                        first = calculate.getResult();
                        System.out.println("Введите второй аргуменрт");
                        second = Double.valueOf(reader.nextLine());
                        calculate.choice(first, second, choise);
                    }else {
                        throw new Exception();
                    }
                }else {
                    return;
                }
            }catch (Exception e) {
                System.out.println("Ошибка ввода данных");
            }

        }else {
            calculate.err("нет предыдущего резальтата");
        }
    }

    /**
     * Метод вычисления резальатата
     */
    private void calculatingResult(){

        while (true) {
            try {
                System.out.println("Введите первый аргуменрт");
                first = Double.valueOf(reader.nextLine());

                System.out.println("Введите второй аргуменрт");
                second = Double.valueOf(reader.nextLine());

                calculate.choice(first, second, choise);
                break;

            } catch (Exception e) {
                System.out.println("Вы ввели неверные значения аргументов");
            }
        }
    }

    /**
     * Главный метод запуска программы с пользовательским вводом
     *
     * @param args
     */
    public static void main(String[] args) {

        InteractRunner ir = new InteractRunner();
        ir.start(ir);
    }
}
