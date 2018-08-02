package interfaces;

/**
 * Интефейс позволяющий реализовать программу калькулятор
 * с 5ю методами.
 * @author lomov
 * @since 02.08.2018
 * @version 1
 */
public interface ICalculate<T extends Number, V extends Number, S extends Number> {

    /**
     * Операция сложения
     * @param first первый аргумент
     * @param second второй аргумент
     * @return сумма
     */
    S summ(T first, V second);

    /**
     * Операция выситания
     * @param first первый аргумент
     * @param second второй аргумент
     * @return разновсть
     */
    S subtract(T first, V second);

    /**
     * Операция умножения
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    S multiply(T first, V second);

    /**
     * Операция деления
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    S share(T first, V second);

    /**
     * Операция вывозведения в степень
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    S degreeOf(T first, V second);

    /**
     * Операция печати на экран
     * @param result аргумент длоя печати
     */
    void printing(S result);

    /**
     * Метод печати ошибок
     * @param er
     */
    void err(String er);

    /**
     * Метод позволяющий выбрать операцию
     * @param first первый аргумент
     * @param second второй аргумент
     * @param ch какую операцию сделать
     */
    void choice(T first, V second, String ch);
}
