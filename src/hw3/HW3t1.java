package hw3;

import java.util.Scanner;

public class HW3t1 {
    /*Ви маєте рядок “Я тестую чудово. Що ще потрібно?”, яку потрібно ввести з клавіатури у консоль.
Необхідно за допомогою тільки методу next() класу Scanner (не використовуємо метод nextLine())
присвоїти змінним типу String наступні значення: string1 = Я string2 = тестую string3 =
 чудово string4 = Що ще потрібно? Крім string1, string2, string3, string4 нових
  змінних створювати не можна.
     */
    public static void main(String[] args) {
        Scanner scannerForLine = new Scanner(System.in);
        /* String textFromScanner = scannerForLine.next();*/
        System.out.println("Введіть речення:");
        String string1 = scannerForLine.next();
        String string2 = scannerForLine.next();
        String string3 = scannerForLine.next();
        String string4 = scannerForLine.next();
        //String string4 = scannerForLine.nextLine(); хотілось би ;)

        System.out.println("string 1 = " + string1);
        System.out.println("string 2 = " + string2);
        System.out.println("string 3 = " + string3);
        /*System.out.println("string 4 = " + string4);*/
        System.out.println("string 4 = " + string4 + "\s" + scannerForLine.next().trim() + "\s" + scannerForLine.next().trim());
        scannerForLine.close();

        /* еще такой вариант пришел в голову :)
        System.out.println("string 4 = " + string4 + "\s" + "ще потрібно?");*/

        /* Я вообще правильно задание поняла?*/


    }
}
