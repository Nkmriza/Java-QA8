package hw6;

import java.security.cert.TrustAnchor;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW6t2 {
    /*2) Написати програму “стрільба по цілі”.
Технічні вимоги:

• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число,
 і введена лінія знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився,
  пропонує ввести число ще раз.
• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки,
куди гравець вже стріляв, слід зазначити як *.
• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу
 You have won!, а також ігрове поле.
• Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте
 інтерфейси List, Set, Map).
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("All Set. Get ready to rumble!");
        char[][] playingBoard = new char[5][5];
        while (true) {
            System.out.println("Choose the line for shooting (1-5):");
            int line = scanner.nextInt() - 1;
            System.out.println("Choose the column for shooting (1-5):");
            int column = scanner.nextInt() - 1;

        }

    }
}
/*char[][] board = {{'0', '1', '2', '3', '4', '5'}, {'1', '-', '*', '-', '-', '-'},
                {'2', '-', '-', '-', '-', '-'}, {'3', '-', '*', '-', '-', '-'},
                {'4', '-', '-', '*', '-', '-'}, {'5', '-', '*', '-', '-', '*'}};
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int a = 0; a < board[i].length; a++) {
                System.out.print(board[i][a] + " ");
            }
            System.out.println(" ");
        }
[0, 1, 2, 3, 4, 5]
[1, -, *, -, -, -]
[2, -, -, -, -, -]
[3, -, *, -, -, -]
[4, -, -, *, -, -]
[5, -, *, -, -, *]
        */
