package hw6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW6t1 {
    /*1) Користувач визначає розмірність двовимірного масиву з клавіатури.
Масив заповнюється випадковими числами від 0 до 1000.
Необхідно створити одновимірний масив, що складається з максимальних значень кожного окремого
масиву, що входить у двовимірний.
Новий отриманий масив вивести на екран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Визначте розмірність двовимірного масиву:");
        int valueOfFistIndex = scanner.nextInt();
        int valueOfSecondIndex = scanner.nextInt();
        int[][] twoDimensionalArray = new int[valueOfFistIndex][valueOfSecondIndex];
        for (int i = 0; i < valueOfFistIndex; i++) {
            for (int j = 0; j < valueOfSecondIndex; j++) {
                twoDimensionalArray[i][j] = random.nextInt(1001);
            }
        }
        System.out.println("Наш двовимірний масив з випадкових чисел:");
        for (int i = 0; i < valueOfFistIndex; i++) {
            for (int j = 0; j < valueOfSecondIndex; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Максимальне значення з кожного масиву:");
        int maxNumber = twoDimensionalArray[0][0];
        for (int i = 0; i < valueOfFistIndex; i++) {
            for (int j = 0; j < valueOfSecondIndex; j++)
            if (twoDimensionalArray[i][j] > maxNumber) {
                maxNumber = twoDimensionalArray[i][j];
               int maxNumber2 = twoDimensionalArray[0][0];
            if (maxNumber2 < maxNumber && valueOfFistIndex > maxNumber && valueOfSecondIndex >maxNumber2) {
                maxNumber2 = maxNumber;
            }
                System.out.print(maxNumber2 + " ");
                System.out.println(maxNumber);
            }

        }
    }
}
