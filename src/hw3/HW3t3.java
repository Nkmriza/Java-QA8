package hw3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW3t3 {
    /*За допомогою тернарного оператора необхідно отримати різницю двох чисел, введених з клавіатури,
    і завжди віднімати від більшого менше. Вивести цю різницю в консоль.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /* int number = scanner.nextInt();*/
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result;
        int i = a - b;
        int i2 = b - a;
        String diff = "Різниця двох чисел: ";

        result = a > b ? i : i2;

        System.out.println(diff + result);
    }
}
