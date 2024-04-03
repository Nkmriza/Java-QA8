package hw4;

import java.util.Scanner;

public class HW4t1 {
    /*Написати програму, яка зчитуватиме введені користувачем слова з клавіатури слова,
     і склеювати їх в одну пропозицію доти, доки користувач не введе з клавітури слово STOP.
     Всі слова, введені до цього, повинні відобразитися в консолі однією пропозицією.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder words = new StringBuilder();
        words.append(" ").append(words);
        System.out.println("Введіть слова");
        System.out.println("Щоб зупинити введіть STOP");
        String stop = "STOP".toLowerCase();


        while (true) {
            String word = scanner.next();
            System.out.println(word);

            if (word.equalsIgnoreCase(stop)) {
                break;
            }
            words.append(word).append(" ");
        }

        System.out.println("цілісне речення: " + words.toString().trim());
        /*System.out.println(words.toString().trim());*/


    }
}
