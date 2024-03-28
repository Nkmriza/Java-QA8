package hw3;

import java.util.Scanner;

public class HW3t4 {
    /*(Використовувати оператори if-else-if) Користувач вводить з клавіатури числа:
     Якщо число дорівнює 1, виведення на консоль “Понеділок”; Якщо число дорівнює 2,
     виведення на консоль “Вівторок”; Якщо число дорівнює 3, виведення на консоль “Середовище”;
     Якщо число дорівнює 4, виведення на консоль “Четвер”; Якщо число дорівнює 5, виведення
      на консоль “П'ятниця”; Якщо число дорівнює 6, виведення на консоль “Субота”;
      Якщо число дорівнює 7, то виведення на консоль "Неділя"; В іншому випадку
      виводимо текст: "Краще б сьогодні була п'ятниця".
     */
    public static void main(String[] args) {
        Scanner dayByNumber = new Scanner(System.in);

        String mon = "Понеділок";
        String tue = "Вівторок";
        String wen = "Середа";
        String thu = "Четвер";
        String fri = "П'ятниця";
        String sat = "Субота";
        String sun = "Неділя";
        String exc = "Краще б сьогодні була п'ятниця";
        int number = dayByNumber.nextInt();

        if (number == 1) {
            System.out.println(mon);
        } else if (number == 2) {
            System.out.println(tue);
        } else if (number == 3) {
            System.out.println(wen);
        } else if (number == 4) {
            System.out.println(thu);
        } else if (number == 5) {
            System.out.println(fri);
        } else if (number == 6) {
            System.out.println(sat);
        } else if (number == 7) {
            System.out.println(sun);
        } else {
            System.out.println(exc);
        }
        dayByNumber.close();


    }
}
