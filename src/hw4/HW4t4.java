package hw4;

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
        System.out.println("Введіть три цифри: ");
        String sentence = scanner.next();
        /*String name1 = arrayName[1];
        String name2 = arrayName[2];
        String name3 = arrayName[3];
        String name4 = arrayName[4];
        String name5 = arrayName[5];
        String name6 = arrayName[6];
        String name7 = arrayName[7];
        System.out.println(name1);*/

        int name = scanner.nextInt() - 1;
        System.out.println(name);
       /* System.out.println(arrayName.length);
        System.out.println(number.length);
        System.out.println(arrayPlace.length);
        System.out.println(arrayName[0].length() + "буде йти в " + arrayPlace[0].length() + "о " + number[0] );*/


    }
}
