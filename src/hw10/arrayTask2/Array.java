package hw10.arrayTask2;

import java.util.Random;
import java.util.Scanner;

public class Array {
    /*) Створити метод, у якому створюється одновимірний масив типу int довільного
    розміру від 1 до 30, в якому кожному елементу масиву надається довільне значення
    від 0 до 30. Даний метод запитує користувача ввести з клавіатури індекс випадково
    згенерованого масиву. Метод повертає значення типу double, яке виходить при розподілі
    елемента із зазначеним індексом користувача на перший елемент даного масиву.
Продумати всі можливі виняткові ситуації, які можуть виникнути у цьому методі. Для кожної
виняткової ситуації створити власний клас checked винятки. Прописати у методі умови генерації
даних винятків, і навіть вказати в сигнатурі даного методу.
Обробку виключення здійснити в сторонньому класі Main в якому потрібно викликати даний метод.*/
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public Array(int[] array) {
        this.array = array;
    }

    public void randomIndex() {
        Random random = new Random();
        int sizeOfArray = random.nextInt(30) + 1;
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = random.nextInt(31);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть індекс від 0 до 30");
        int index = scanner.nextInt();
    }
}
