package hw8;

import java.util.Scanner;

public class Calculator {
    /*Створити клас калькулятор.
У ньому створити методи:
summ,
minus,
multiply,
division.
(Додавання, віднімання, множення та поділ відповідно.)
Кожен метод приймає як параметри два значення типу double.
 І виводить у консоль результат дії.
Також у класі є метод старт. Який виводить повідомлення в консоль,
що калькулятор запущено. І пропонує ввести дію у вашій консолі.*/
    public double double1;
    public double double2;
    public void summ (){
        double summ = double1 + double2;
    }
    public void minus (){
        double min = double1 - double2;
    }
    public void multiply (){
        double mult = double1 * double2;
    }
    public void division (){
        double div = double1 / double2;
    }
    public void start (){
        System.out.println("Калькулятор запущено.\n"+ "Введіть вашу дію: ");
    }

/*Калькулятор повинен приймати лише такі типи дій:
2+4; - приклад синтаксису додавання;
5-6; - приклад синтаксису віднімання;
25*3; - Приклад синтаксису множення;
34/3; - Приклад синтаксису поділу;

Після введення на консоль виводиться відповідь цієї дії.
І потім знову виводиться повідомлення про пропозицію ввести дію.
Програма закривається після введення Stop. Перед закриттям на консоль
має виводитись повідомлення:
"Калькулятор закрито".*/
public static void main(String[] args) {
    Calculator calc = new Calculator();
    Scanner sc = new Scanner(System.in);
}

}
