package hw3;

import javax.swing.plaf.synth.SynthGraphicsUtils;
import java.util.Scanner;

public class HW3t2 {
    /*Користувач вводить з клавіатури три цілі значення. На екран виводиться інформація,
     чи можна з цих сторін побудувати трикутник.
     (Необхідно згадати правило побудови трикутника з трьох сторін).*/

    public static void main(String[] args) {
        Scanner scannerForTriangle = new Scanner(System.in);
        System.out.println("Введіть цілі значення для побудови трикутника: ");
        /*int myIntFromScanner = scannerForTriangle.nextInt();*/
        int a = scannerForTriangle.nextInt();
        int b = scannerForTriangle.nextInt();
        int c = scannerForTriangle.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a + b > c) {
            System.out.println("Можна побудувати трикутник");
        } else {
            System.out.println("Не можна побудувати трикутник з цих сторін");
        }
        scannerForTriangle.close();
    }
}
