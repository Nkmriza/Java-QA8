package hw3;

import java.util.Scanner;

public class HW3t5 {
    /*Написати програму, використовуючи тернарний оператор, де користувач
     вводить з клавіатури два числа і символ – + або % або / або *.
     На екран виводиться результат дії над двома введеними числами.
     Якщо користувач ввів щось окрім даних символів, необхідно вивести 0.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int a = scanner.nextInt();
        System.out.println("Введіть друге число");
        int b = scanner.nextInt();
        int c = 0;
        String char1 = "+";
        String char2 = "-";
        String char3 = "%";
        String char4 = "*";
        String char5 = "/";
        System.out.println("Введіть арифметичну операцію");
        int result;
        String symbol = scanner.next();

        result = symbol.equals(char1) ? (a + b) : symbol.equals(char2)? (a - b) : symbol.equals(char3) ?
                (a % b) : symbol.equals(char4) ? (a * b): symbol.equals(char5) ? (a / b) : c;

        System.out.println(result);
        scanner.close();


    }
}
