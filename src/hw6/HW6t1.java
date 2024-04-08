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
        System.out.println("Наш двовимірний масив з випадкових чисел:");
        for (int i = 0; i < valueOfFistIndex; i++) {
            for (int j = 0; j < valueOfSecondIndex; j++) {
                twoDimensionalArray[i][j] = random.nextInt(1000);
            }

            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
        System.out.println();
        System.out.println("Масив з максимальних значень кожного окремого масиву:");
        int [] newArray = new int[valueOfFistIndex];
        for (int i = 0; i < valueOfFistIndex; i++) {
            int maxNumber = twoDimensionalArray[i][0];
            for (int j = 1; j < valueOfSecondIndex; j++) {
                if (twoDimensionalArray[i][j] > maxNumber) {
                    maxNumber = twoDimensionalArray[i][j];
                }
            }
           newArray [i] = maxNumber;
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println();
    }
}
