package calcexecutor;

import java.util.Scanner;

/**
 * Ревлизует калькулятор. Поддерживает вторичное использование предыдужего
 * вычисления
 *
 * @author lomov
 * @since 16.03.2018
 */
public class Calculator {

    public double result;
    private String shoize;
    Scanner scan;
    
    public Calculator() {
        Scanner scan = new Scanner(System.in);
    }

    public String start() {
        System.out.println("\t\tКалькулятор");
        System.out.println("--------------------------------------------");
        System.out.println("1. сложить");
        System.out.println("2. вычесть");
        System.out.println("3. умножить");
        System.out.println("4. делить");
        System.out.println("5. степень");
        System.out.println("6. операция с результатом");
        System.out.println("7. очистить");
        System.out.println("q. выход");

        shoize = scan.nextLine();
        return shoize;
    }

    /**
     * Вычисляем сложение.
     *
     * @param fitst первый аргумент
     * @param second второй аргумент
     */
    public void add(double fitst, double second) {
        this.result = fitst + second;
    }

    /**
     * Вычитание.
     *
     * @param fitst
     * @param second
     */
    public void sub(double fitst, double second) {
        this.result = fitst - second;
    }

    /**
     * Умножение.
     *
     * @param fitst
     * @param second
     */
    public void mult(double fitst, double second) {
        this.result = fitst * second;
    }

    /**
     * Деление. Метод выкинет исключение если делить на 0
     *
     * @param fitst первый аргумент
     * @param second второй аргумент
     */
    public void div(double fitst, double second) {
        if (second != 0d) {
            this.result = fitst / second;
        } else {
            throw new ArithmeticException("Нельзя делить на 0");
        }
    }

    /**
     * Возведение в степень.
     *
     * @param first первый агрумент.
     * @param second второй агрумент.
     */
    public void expand(double first, int second) {
        double temp = first;

        for (int index = 0; index != second; ++index) {
            temp *= first;
        }
        this.result = temp;
    }
    
    public void calc(String operation, double first, double second){
        if("+".equals(operation)){
            this.add(first, second);
        }else if("-".equals(operation)){
            this.sub(first, second);
        }else if("*".equals(operation)){
            this.mult(first, second);
        }else if("/".equals(operation)){
            this.div(first, second);
        }else if("^".equals(operation)){
            this.expand(first, (int) second);
        }else{
            throw new UnsupportedOperationException();
        }
    }
}
