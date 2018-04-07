package ru.javacourse.lesson3.calcmavem;

import java.util.logging.Logger;
//import java.util.logging.LoggerFactory;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Console IO.
 *
 * @author parsentev
 * @since 14.06.2016
 */
public class ConsoleIO implements IO {

    private static final Logger log = Logger.getLogger(ConsoleIO.class.toString());
    private final Scanner scanner;
    private final PrintStream out;

    public ConsoleIO(final Scanner scanner, final PrintStream out) {
        this.scanner = scanner;
        this.out = out;
    }

    @Override
    public String read() {
        return this.scanner.next();
    }

    @Override
    public void println(Object value) {
        this.out.println(value);
    }
}
