package interfaces;

/**
 * Интефейс позволяющий реализовать программу калькулятор
 * с 5ю методами.
 * @author lomov
 * @since 02.08.2018
 * @version 1
 */
public interface ICalculate <T extends Number>{

    /**
     * Операция сложения
     * @param first первый аргумент
     * @param second второй аргумент
     * @return сумма
     */
    Integer summ(Integer first, Integer second);

    /**
     * Операция выситания
     * @param first первый аргумент
     * @param second второй аргумент
     * @return разновсть
     */
    Integer subtract(Integer first, Integer second);

    /**
     * Операция умножения
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    Integer multiply(Integer first, Integer second);

    /**
     * Операция деления
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    Double share(Integer first, Integer second);

    /**
     * Операция вывозведения в степень
     * @param first первый аргумент
     * @param second второй аргумент
     * @return результат
     */
    Integer degreeOf(Integer first, Integer second);

    /**
     * Операция печати на экран
     * @param result аргумент длоя печати
     */
    void printing(T result);

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
    void choice(Integer first, Integer second, String ch);
}
