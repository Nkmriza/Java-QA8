package hw8.calculatorTask4;

import java.util.Scanner;

public class Calculator {
    /*Створити клас калькулятор.
У ньому створити методи:
summ,
minus,
multiply,
division.
(Додавання, віднімання, множення та поділ відповідно.)
Кожен метод приймає як параметри два значення типу double.
 І виводить у консоль результат дії.
Також у класі є метод старт. Який виводить повідомлення в консоль,
що калькулятор запущено. І пропонує ввести дію у вашій консолі.
Калькулятор повинен приймати лише такі типи дій:
    2+4; - приклад синтаксису додавання;
    5-6; - приклад синтаксису віднімання;
    25*3; - Приклад синтаксису множення;
    34/3; - Приклад синтаксису поділу;

    Після введення на консоль виводиться відповідь цієї дії.
    І потім знову виводиться повідомлення про пропозицію ввести дію.
    Програма закривається після введення Stop. Перед закриттям на консоль
    має виводитись повідомлення:
    "Калькулятор закрито".*/

    public void summ(double double1, double double2) {
        System.out.println(double1 + double2);
        /*double summ = double1 + double2;*/
    }

    public void minus(double double1, double double2) {
        System.out.println(double1 - double2);
    }

    public void multiply(double double1, double double2) {
        System.out.println(double1 * double2);
    }

    public void division(double double1, double double2) {
        System.out.println(double1 / double2);
    }

    public void start() {
        System.out.println("Калькулятор запущено.\n" + "Введіть вашу дію: ");
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();

        while (!action.equalsIgnoreCase("stop")) {
            System.out.println("Введіть два числа для дії: ");
            double number1 = sc.nextDouble();
            double number2 = sc.nextDouble();
            switch (action) {
                case "+" -> summ(number1, number2);
                case "-" -> minus(number1, number2);
                case "*" -> multiply(number1, number2);
                case "/" -> division(number1, number2);
                default -> System.out.println("Недопустипа операція.");
            }
            System.out.println("Введіть Stop, щоб закрити калькулятор, або почніть спочатку: ");
            action = sc.next();
        }
        System.out.println("Калькулятор закрито.");
        sc.close();
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.start();
    }

}


/*public double double1;
    public double double2;*/