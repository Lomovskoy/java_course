import implement.Calculate;

import java.util.Scanner;

public class InteractRunner {

    /**
     * Главный класс запуска программы с пользовательским вводом
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Calculate calculate = new Calculate();
        String choise = "";
        Double first;
        Double second;

        System.out.println("Добро пожаловать в программу калькулятор");

        while (true){

            calculate.printChose();

            choise = reader.nextLine();

            if(!choise.equals("q")){

                if(choise.equals("1") || choise.equals("2") || choise.equals("3") || choise.equals("4") ||
                        choise.equals("5") || choise.equals("6") || choise.equals("7")){

                    if(choise.equals("6")){

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
                                    break;
                                }
                            }catch (Exception e) {
                                System.out.println("Ошибка ввода данных");
                            }

                        }else {
                            calculate.err("нет предыдущего резальтата");
                        }

                    }else if(choise.equals("7")){

                        calculate.clearResult();
                        System.out.println("Предыдущий результат очищен");

                    }else if(!choise.equals("")){

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

                }else {
                    System.out.println("Вы выбрали неправильный вариант");
                }


            }else {
                break;
            }
        }

        System.out.println("Программа завершена");
    }
}
