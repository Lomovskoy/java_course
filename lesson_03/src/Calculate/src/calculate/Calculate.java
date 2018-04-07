package calculate;


/*
Добавьте арифметические вычисления: + - * / ^
Сделайте класс адаптивным для типов int, short, long, float и double.
 */
public class Calculate {

    public static void main(String[] arg) {

        System.out.println("Calculate...");

        if (arg.length == 2) {
            Calculate calculate = new Calculate();
            System.out.println("------------------------");
            calculate.calcInt(arg);
            System.out.println("------------------------");
            calculate.calcShort(arg);
            System.out.println("------------------------");
            calculate.calcLong(arg);
            System.out.println("------------------------");
            calculate.calcFloat(arg);
            System.out.println("------------------------");
            calculate.calcDouble(arg);
            System.out.println("------------------------");

        } else {
            System.out.println("Не переданно аргументов");
        }
    }

    private void calcInt(String[] arg) {

        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int sum = first + second;
        System.out.println("SumInt: " + sum);

        sum = first - second;
        System.out.println("SubInt: " + sum);

        sum = first * second;
        System.out.println("MultInt: " + sum);

        sum = first ^ second;
        System.out.println("DegInt: " + sum);

        try {
            double sum1 = first / second;
            System.out.println("DivInt: " + sum1);
        } catch (Exception e) {
            System.out.println("Ошибка деления на ноль.");
        }
    }
    
    private void calcShort(String[] arg) {

        short first = Short.valueOf(arg[0]);
        short second = Short.valueOf(arg[1]);
        int sum = first + second;
        System.out.println("SumShort: " + sum);

        sum = first - second;
        System.out.println("SubShort: " + sum);

        sum = first * second;
        System.out.println("MultShort: " + sum);

        sum = first ^ second;
        System.out.println("DegShort: " + sum);

        try {
            double sum1 = first / second;
            System.out.println("DivShort: " + sum1);
        } catch (Exception e) {
            System.out.println("Ошибка деления на ноль.");
        }
    }
    
    private void calcLong(String[] arg) {

        long first = Long.valueOf(arg[0]);
        long second = Long.valueOf(arg[1]);
        long sum = first + second;
        System.out.println("SumLong: " + sum);

        sum = first - second;
        System.out.println("SubLong: " + sum);

        sum = first * second;
        System.out.println("MultLong: " + sum);

        sum = first ^ second;
        System.out.println("DegLong: " + sum);

        try {
            double sum1 = first / second;
            System.out.println("DivLong: " + sum1);
        } catch (Exception e) {
            System.out.println("Ошибка деления на ноль.");
        }
    }
    
    private void calcFloat(String[] arg) {

        float first = Float.valueOf(arg[0]);
        float second = Float.valueOf(arg[1]);
        float sum = first + second;
        System.out.println("SumFloat: " + sum);

        sum = first - second;
        System.out.println("SubFloat: " + sum);

        sum = first * second;
        System.out.println("MultFloat: " + sum);
        
	sum = (float) Math.pow(first, second);
        System.out.println("DegFloat: " + sum);

        try {
            double sum1 = first / second;
            System.out.println("DivFloat: " + sum1);
        } catch (Exception e) {
            System.out.println("Ошибка деления на ноль.");
        }
    }
    
    private void calcDouble(String[] arg) {

        double first = Float.valueOf(arg[0]);
        double second = Float.valueOf(arg[1]);
        double sum = first + second;
        System.out.println("SumDouble: " + sum);

        sum = first - second;
        System.out.println("SubDouble: " + sum);

        sum = first * second;
        System.out.println("MultDouble: " + sum);
        
	sum = Math.pow(first, second);
        System.out.println("DegDouble: " + sum);

        try {
            sum = first / second;
            System.out.println("DivDouble: " + sum);
        } catch (Exception e) {
            System.out.println("Ошибка деления на ноль.");
        }
    }
}
