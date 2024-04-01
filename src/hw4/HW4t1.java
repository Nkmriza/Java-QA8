package hw4;

import java.util.Scanner;

public class HW4t1 {
    /*Написати програму, яка зчитуватиме введені користувачем слова з клавіатури слова,
     і склеювати їх в одну пропозицію доти, доки користувач не введе з клавітури слово STOP.
     Всі слова, введені до цього, повинні відобразитися в консолі однією пропозицією.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        System.out.println("Введіть слова");
        System.out.println("Щоб зупинити введіть STOP");
        String words = scanner.next();
        String stop = "STOP";

        /*do {
            System.out.println(words.trim());
        }
        while{
            System.out.println("STOP");
        }*/


    }
}
