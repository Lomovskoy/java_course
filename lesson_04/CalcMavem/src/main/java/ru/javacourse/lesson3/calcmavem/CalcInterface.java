package ru.javacourse.lesson3.calcmavem;

/**
 * Интерфейс для класса Калькулятор)
 * @author lomov
 */
public interface CalcInterface {
    
    public void add(double first, double second);
    
    public void div(double first, double second);
    
    public void expand(double first, int second);
     
    public void substract(double first, double second);
     
    public void multiple(double first, double second);
    
    public double result();

    public void calc(String operation, double first, double second);
}
