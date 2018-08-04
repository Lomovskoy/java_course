package interfaces;

/**
 * Интефейс позволяющий реализовать программу калькулятор
 * с 5ю методами.
 * @author lomov
 * @since 02.08.2018
 * @version 1
 */
public interface ICalculate{

    /**
     * Операция сложения
     * @param first первый аргумент
     * @param second второй аргумент
     * @return сумма
     */
    void summ(Double first, Double second);

    /**
     * Операция выситания
     * @param first первый аргумент
     * @param second второй аргумент
     * @return разновсть
     */
    void subtract(Double first, Double second);

    /**
     * Операция умножения
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    void multiply(Double first, Double second);

    /**
     * Операция деления
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    void share(Double first, Double second);

    /**
     * Операция вывозведения в степень
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    void degreeOf(Double first, Double second);

    /**
     * Операция печати на экран
     */
    void printing();

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
    void choice(Double first, Double second, String ch);

    /**
     * Получить результат
     * @return результат
     */
    Double getResult();

    /**
     * Получить последнее действие
     * @return действие
     */
    String getAction();

    /**
     * Очистить результат
     * @return да или нет
     */
    Boolean clearResult();

    /**
     * Очистить действие
     * @return да или нет
     */
    Boolean clearAction();

    /**
     * Метод печатающий вывод выбора
     */
    void printChose();
}
