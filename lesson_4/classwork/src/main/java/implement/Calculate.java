package implement;

import interfaces.ICalculate;

public class Calculate implements ICalculate {

    //Результат вычислений
    private Double result = null;
    //Выбор действия
    private String ch = null;

    /**
     * Операция сложения
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return сумма
     */
    public void summ(Double first, Double second) {
        this.result =  first + second;
    }

    /**
     * Операция выситания
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return разновсть
     */
    public void subtract(Double first, Double second) {
        this.result = first - second;
    }

    /**
     * Операция умножения
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public void multiply(Double first, Double second) {
        this.result = first * second;
    }

    /**
     * Операция деления
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public void share(Double first, Double second) {
        if(second != 0)
            this.result = Double.valueOf(first / second);
        else
            Calculate.this.err("Ошибка деления на ноль");
    }

    /**
     * Операция вывозведения в степень
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    public void degreeOf(Double first, Double second) {
        Double temp = first;
        for (int i = 0; i != second; ++i){
            temp += first;
        }
        this.result = temp;

        //this.result = Math.pow(first, second);
    }

    /**
     * Операция печати на экран
     */
    public void printing() {
        System.out.println("Резальтат вычисления = " + this.result);
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
        this.ch = ch;
        if(this.ch.equals("1")){
            Calculate.this.summ(first, second);
            Calculate.this.printing();
        }else if(this.ch.equals("2")){
            Calculate.this.subtract(first, second);
            Calculate.this.printing();
        }else if(this.ch.equals("3")){
            Calculate.this.multiply(first, second);
            Calculate.this.printing();
        }else if(this.ch.equals("4")){
            Calculate.this.share(first, second);
            Calculate.this.printing();
        }else if(this.ch.equals("5")){
            Calculate.this.degreeOf(first, second);
            Calculate.this.printing();
        }else{
            Calculate.this.err("Ошибка выбора орперации");
        }
    }

    /**
     * Получить результат
     *
     * @return результат
     */
    @Override
    public Double getResult() {
        return this.result;
    }

    /**
     * Получить последнее действие
     *
     * @return действие
     */
    @Override
    public String getAction() {
        return this.ch;
    }

    /**
     * Очистить результат
     *
     * @return да или нет
     */
    @Override
    public Boolean clearResult() {
        this.result = null;
        return true;
    }

    /**
     * Очистить действие
     *
     * @return да или нет
     */
    @Override
    public Boolean clearAction() {
        this.ch = null;
        return true;
    }

    /**
     * Метод печатающий вывод выбора
     */
    @Override
    public void printChose() {

        System.out.println("Выберите действие");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        System.out.println("5 - возведение в степень");
        System.out.println("6 - операция с готовым результатом");
        System.out.println("7 - очистить результат");
        System.out.println("q - выход");
    }
}
