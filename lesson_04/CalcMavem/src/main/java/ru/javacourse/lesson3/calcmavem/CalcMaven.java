package ru.javacourse.lesson3.calcmavem;

import java.util.Scanner;

/**
 * Калькулятор. Поддерживает пользовательский ввод.
 *
 * @author parsentev
 * @since 17.07.2015
 */
public class CalcMaven {

    private final Calkulator calculator;
    private final IO io;

    public CalcMaven(final Calkulator calculator, final IO io) {
        this.calculator = calculator;
        this.io = io;
    }

    public void start() {
        boolean reuse = false;
        try (final Validator validator = new Validator(io)) {
            do {
                final double first;
                if (reuse) {
                    first = calculator.result();
                } else {
                    first = validator.getDouble("Enter first arg : ");
                }
                String operation = validator.getString("Enter operation : ");
                double second = validator.getDouble(
                        "Enter second arg : "
                );
                calculator.calc(operation, first, second);
                io.println(
                        String.format("%s %s %s = %s",
                                first, operation, second, calculator.result()
                        )
                );
                reuse = validator.compare(
                        "Do you want to reuse result? (y)", "y"
                );
            } while (validator.compare("Do you want to continue? (y)", "y"));
        }
    }

    public static void main(String[] args) {
        new CalcMaven(
                new Calkulator(),
                new ConsoleIO(new Scanner(System.in), System.out)
        ).start();
    }
}
