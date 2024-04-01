package hw4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW4t2 {
    /*Написати програму в якій користувач вводить з клавіатури число,
    а програма визначає, є поліндромом чи ні. І виводить цю інформацію на екран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int number = scanner.nextInt();
        String numberSt = Integer.toString(number);
        StringBuilder str = new StringBuilder(numberSt);

        if (numberSt.equals(str.reverse().toString())) {
            System.out.println(number + " " + "є поліндромом.");
        } else {
            System.out.println(number + " " + "не є поліндромом!");
        }
    }
}
