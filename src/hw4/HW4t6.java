package hw4;

import java.util.Arrays;
import java.util.Random;

public class HW4t6 {
    /*Заповнити масив на 45 елементів довільними числами від -50 до +50.
    Знайти мінімальний елемент та вивести його на консоль. Знайти максимальний
    елемент та вивести його на консоль.*/
    public static void main(String[] args) {
        /* Random randomObject = new Random();*/
        int[] numbersAmount = new int[45];
        for (int i = 0; i < numbersAmount.length; i++) {
            numbersAmount[i] = new Random().nextInt(-50, 50);
        }
        int minNumber = numbersAmount[0];
        int maxNumber = numbersAmount[0];

        for (int i = 0; i < numbersAmount.length; i++) {
            if (numbersAmount[i] < minNumber) {
                minNumber = numbersAmount[i];
            }
        }

        for (int i = 0; i < numbersAmount.length; i++) {
            if (numbersAmount[i] > maxNumber) {
                maxNumber = numbersAmount[i];
            }
        }

        for (int number : numbersAmount) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        System.out.println(minNumber);
        System.out.println(maxNumber);

        System.out.println("============");
        System.out.println(" ");
        int minNumber2 = Arrays.stream(numbersAmount).min().getAsInt();
        int maxNumber2 = Arrays.stream(numbersAmount).max().getAsInt();
        System.out.println(minNumber2);
        System.out.println(maxNumber2);
        /* в гугле пишут, что можно еще таким способом*/

    }

}
