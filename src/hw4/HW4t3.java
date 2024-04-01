package hw4;

import java.util.Scanner;

public class HW4t3 {
    /*Написати програму, умовно для складу прийому металу.
     Припустимо, що склад може зберігати певну вагу металу.
     Користувач вводить з клавіатури вагу, яка може зберігатися на складі.
     Далі користувач вводить з клавіатури вагу, яку умовно збирається здати на склад користувач.
     Програма повинна після кожної здачі металу показувати скільки ваги може прийняти склад.
     Якщо користувач хоче здати металу більше ніж залишилося місця на складі,
     то програма не дає йому це зробити і повідомляє користувача про неможливість цієї операції.
     Якщо користувач здає метал вагою менше 5, програма теж попереджає про неможливість
     приймання такої малої ваги. Програма завершується, коли місце на складі закінчилось.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть вагу, яка може зберігатіся на складі в кг: ");
        int initialWeight = scanner.nextInt();
        String info = "Ви можете додати ще: ";

        while (initialWeight >= 0) {
            System.out.println("Яку вагу ви збираєтесь здати на склад?");
            int addedWeight = scanner.nextInt();
            if (addedWeight < 5) {
                System.out.println("Склад приймає вагу від 5 кг");
                continue;
            }
            if (initialWeight < addedWeight) {
                System.out.println("Недостатньо місця." + info + initialWeight + "кг.");
                continue;
            }
            /*int weight2 = weight - i; - этот вариант не работает:(*/
            initialWeight -= addedWeight;
            System.out.println("Залишилось місця на складі: " + initialWeight + " кг.");

            if (initialWeight == 0) {
                break;
            }
        }
        System.out.println("На складі закінчилось місце");

    }
}
