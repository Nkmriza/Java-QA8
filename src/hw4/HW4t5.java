package hw4;

import java.util.Random;
import java.util.Scanner;

public class HW4t5 {
    /*Є одновимірний масив із 10 елементів, заповнений випадковими числами.
     Користувач вводить із клавіатури число. Програма показує чи є таке число
     у створеному раніше масиві.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random numbers = new Random();
        int[] numbersInArray = new int[10];
        for (int i = 0; i < numbersInArray.length; i++) {
            numbersInArray[i] = numbers.nextInt(20);
        }
        for (int randomNumbers : numbersInArray) {
            System.out.print(randomNumbers + " ");
        }

        System.out.println(" ");
        System.out.println("Введіть число:");
        int certainNumber = scanner.nextInt();
        boolean answerForChosenNumber  = false;

        for (int i = 0; i < numbersInArray.length; i++) {
            if (numbersInArray[i] == certainNumber) {
                answerForChosenNumber = true;
            }
        }

        if (answerForChosenNumber) {
            System.out.println("Число " + certainNumber + " " + "є у даному масиві");
        } else {
            System.out.println("Таке число відсутнє у даному масиві");
        }

    }

}
