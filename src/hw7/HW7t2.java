package hw7;

import java.util.Arrays;

public class HW7t2 {
    /*2) Написати перевантажений метод, який може:
• Не приймати жодних значень, тоді він виводитиме на консоль повідомлення типу: "Я порожній".
• Приймати як параметри String, тоді він виводитиме на консоль це повідомлення.
• Приймати як параметри масив рядків, тоді він виводитиме на консоль усі його значення через пробіл.
• Приймати як параметр масив чисел, тоді він виводитиме на консоль суму елементів масиву.
• Приймати як параметри число і рядок, тоді він буде виводити на консоль повідомлення типу:
 "Ваше повідомлення - "%%%%%%%%", ваше число - $", де "%%%%%%%%%" і $ ваші введені рядок
  та число відповідно.
     */

    public static void main(String[] args) {
        HW7t2 task2 = new HW7t2();
        task2.overloadMethod();
        task2.overloadMethod("це наше повідомлення");
        task2.overloadMethod(new String[]{"Це", "наш", "масив"});
        task2.overloadMethod(new int[]{34, 234, 45, 67, 54});
        task2.overloadMethod(1, "%%%%%%%%");
    }

    public void overloadMethod() {
        System.out.println("Я порожній");
    }

    public void overloadMethod(String text) {
        System.out.println("Текст: " + text);
    }

    public void overloadMethod(String[] array) {
        /*System.out.println(Arrays.toString(array));*/
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void overloadMethod(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Cума елементів масиву: " + sum);

    }

    public void overloadMethod(int number, String text) {
       /*number = Integer.parseInt("$");
        String character2 = "%%%%%%%%";*/
        System.out.println("Ваше повідомлення - " + text + ", ваше число - " + number);

    }

}

