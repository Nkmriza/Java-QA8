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
        for (int i = 0; i < playingBoard.length; i++) {
            for (int j = 0; j < playingBoard.length; j++) {
                playingBoard[i][j] = '-';
            }
        }
        int neededLine = random.nextInt(4) + 1;
        int neededColumn = random.nextInt(4) + 1;

        while (true) {

            int line;
            System.out.println("Choose the line for shooting (1-5):");
            line = scanner.nextInt();
            while (line < 1 || line > 5) {
                System.out.println("Invalid line. Choose the line for shooting (1-5):");
                line = scanner.nextInt();
            }
            int column;
            System.out.println("Choose the column for shooting (1-5):");
            column = scanner.nextInt();
            while (column < 1 || column > 5) {
                System.out.println("Invalid column. Choose the column for shooting (1-5):");
                column = scanner.nextInt();
            }
            /*System.out.println("line = " + line);
            System.out.println("column = " + column);
            System.out.println(neededLine);
            System.out.println(neededColumn);*/

            if (line == neededLine && column == neededColumn) {
                System.out.println("You have won!");
                playingBoard[line - 1][column - 1] = 'x';
                System.out.println("Playing field:");
                for (int i = 0; i < playingBoard.length; i++) {
                    for (int j = 0; j < playingBoard.length; j++) {
                        System.out.print(playingBoard[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Try again.");
                playingBoard[line - 1][column - 1] = '*';
                System.out.println("Playing field:");
                for (int i = 0; i < playingBoard.length; i++) {
                    for (int j = 0; j < playingBoard.length; j++) {
                        System.out.print(playingBoard[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
 /*char[][] board = {{'0', '1', '2', '3', '4', '5'}, {'1', '-', '-', '-', '-', '-'},
                    {'2', '-', '-', '-', '-', '-'}, {'3', '-', '-', '-', '-', '-'},
                    {'4', '-', '-', '-', '-', '-'}, {'5', '-', '-', '-', '-', '-'}};
  System.out.println();
  for (int i = 0; i < board.length; i++) {
  for (int j = 0; j < board[i].length; j++) {
  System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }8*/
