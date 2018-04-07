package ru.javacourse.lesson3.calcmavem;

/**
 * Реализация Интерфейса калькулятор
 * @author lomov
 */
public class Calkulator implements CalcInterface{
    private double result;
    /**
     * Вычисляем сложение.
     *
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    @Override
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Деление. Метод выкинет испключение если второй аргумент 0.
     *
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    @Override
    public void div(double first, double second) {
        if (second != 0d) {
            this.result = first / second;
        } else {
            throw new ArithmeticException("Cound not div by 0");
        }
    }
    /**
     * Возведение в степень.
     *
     * @param first первый агрумент.
     * @param second второй агрумент.
     */
    @Override
    public void expand(double first, int second) {
                double temp = first;
        for (int index = 0; index != second; ++index) {
            temp *= first;
        }
        this.result = temp;
    }
    /**
     * Вычитание.
     *
     * @param first первый агрумент.
     * @param second второй агрумент.
     */
    @Override
    public void substract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Умножение.
     *
     * @param first первый агрумент.
     * @param second второй агрумент.
     */
    @Override
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Результат.
     * @return double
     */
    @Override
    public double result() {
        return this.result;
    }
    /**
     * Вычисляем арифметическую операцию на основании входных значений.
     *
     * @param operation операция + - * / ^
     * @param first аргумент.
     * @param second аргумент.
     */
    @Override
    public void calc(String operation, double first, double second) {
        if ("+".equals(operation)) {
            this.add(first, second);
        } else if ("-".equals(operation)) {
            this.substract(first, second);
        } else if ("*".equals(operation)) {
            this.multiple(first, second);
        } else if ("/".equals(operation)) {
            this.div(first, second);
        } else if ("^".equals(operation)) {
            this.expand(first, (int) second);
        } else {
            throw new UnsupportedOperationException();
        }
    }
    
}
