package implement;

import interfaces.ICalculate;

public class Calculate implements ICalculate {


    /**
     * Операция сложения
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return сумма
     */
    public Double summ(Double first, Double second) {
        return first + second;
    }

    /**
     * Операция выситания
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return разновсть
     */
    public Double subtract(Double first, Double second) {
        return first - second;
    }

    /**
     * Операция умножения
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public Double multiply(Double first, Double second) {
        return first * second;
    }

    /**
     * Операция деления
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public Double share(Double first, Double second) {
        return Double.valueOf(first / second);
    }

    /**
     * Операция вывозведения в степень
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public Double degreeOf(Double first, Double second) {
        return Math.pow(first, second);
    }

    /**
     * Операция печати на экран
     *
     * @param result аргумент длоя печати
     */
    public void printing(Number result) {
        System.out.println("Резальтат вычисления = " + result);
    }

    /**
     * Метод печати ошибок
     *
     * @param er
     */
    public void err(String er) {
        System.out.println(er);
    }

    /**
     * Метод позволяющий выбрать операцию
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @param ch     какую операцию сделать
     */
    public void choice(Double first, Double second, String ch) {
        if(ch.equals("1")){
            Double res = Calculate.this.summ(first, second);
            Calculate.this.printing(res);
        }else if(ch.equals("2")){
            Double res = Calculate.this.subtract(first, second);
            Calculate.this.printing(res);
        }else if(ch.equals("3")){
            Double res = Calculate.this.multiply(first, second);
            Calculate.this.printing(res);
        }else if(ch.equals("4")){
            Double res = Calculate.this.share(first, second);
            Calculate.this.printing(res);
        }else if(ch.equals("5")){
            Double res = Calculate.this.degreeOf(first, second);
            Calculate.this.printing(res);
        }else{
            Calculate.this.err("Ошибка выбора орперации");
        }
    }
}
