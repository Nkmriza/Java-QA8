package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4t4 {
    /*Перший складатиметься з наступних імен: “Петя”, “Маша”, “Олена”, “Федя”,
     “Саша”, “Антон”, “Гліб”. Другий міститиме такі значення типу int: 10, 12,
     14, 16, 18, 20. Третій міститиме такі значення: “школу”, “магазин”, “церква”,
     “тренажерний зал”, “кіно”, “поліклініку” . Користувач вводить три числа з клавіатури,
     які відповідатимуть індексам кожного з елементів масивів. Приклад1. після введення
     3,2,1: На екрані має вивестися наступне повідомлення: “Федя буде йти до магазину о 14:00”
     Приклад2. після введення 1,2,3: На екрані має вивестися наступне повідомлення:
     "Маша йтиме в тренажерний зал о 14:00"*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayName = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] number = {10, 12, 14, 16, 18, 20};
        String[] arrayPlace = {"школу", "магазин", "церкву",
                "тренажерний зал", "кіно", "поліклініку"};
        String expectedString = "{NAME} піде в {PLACE} о {TIME}:00";
        System.out.println("Введіть три числа (де перше від 0 до 6, два інших від 0 до 5)");
        int index = scanner.nextInt();
        int index2 = scanner.nextInt();
        int index3 = scanner.nextInt();
        while (index < 0 || index >= 6) {
            System.out.println("Перше значення від 0 до 6");
            index = scanner.nextInt();
        }
        while (index2 < 0 || index2 >= 5 || index3 < 0 || index3 >= 5) {
            System.out.println("Друге та третє значення від 0 до 5");
            index2 = scanner.nextInt();
            index3 = scanner.nextInt();
        }

        System.out.println(expectedString.replace("{NAME}", arrayName[index]).
                replace("{PLACE}", arrayPlace[index2]).
                replace("{TIME}", Integer.toString(number[index3])));

    }
}