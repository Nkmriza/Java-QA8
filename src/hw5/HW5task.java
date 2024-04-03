package hw5;

import java.util.Random;
import java.util.Scanner;

public class HW5task {
    /*Написати програму “числа”, яка загадує випадкове число та пропонує гравцеві його вгадати.
Технічні вимоги:
• За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
 та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
• Перед початком на екран виводиться текст: Let the game begin!
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести число в консоль, після чого програма
порівнює загадану кількість з тим, що ввів користувач.
• Якщо введене число менше загаданого, програма виводить на екран текст:
Your number is too small. Please, try again.. Якщо введене число більше за
загадане, то програма виводить на екран текст: Your number is too big.  Please, try again..
• Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!
• Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).
     */


    public static void main(String[] args) {
        /*java.util.random.RandomGenerator;*/
        System.out.println("LET THE GAME BEGIN!");
        Scanner scanner = new Scanner(System.in);
        Random randomNumbers = new Random();
        int[] numbers = new int[1];
        String congrats = "Congratulations, {name}!";

        System.out.println("Write your name:");
        String name = scanner.nextLine();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumbers.nextInt(100);

           /* for (int oneRandomNumber : numbers) {
                System.out.print(oneRandomNumber + " ");
            }*/
        }
        System.out.println("Guess a number between 0 and 100");

        while (true) {
            int yourNumber = scanner.nextInt();
            boolean playersNumberIsSmaller = false;
            boolean playersNumberIsBigger = false;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > yourNumber) {
                    playersNumberIsSmaller = true;
                }
                if (numbers[i] < yourNumber) {
                    playersNumberIsBigger = true;
                }

                if (playersNumberIsSmaller) {
                    System.out.println("Your number is too small. Please, try again");
                } else if (playersNumberIsBigger) {
                    System.out.println("Your number is too big.  Please, try again");
                }

            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == yourNumber) {
                    System.out.println(congrats.replace("{name}", name));
                }
            }
        }
    }
}

