package hw8;

public class Tree {
    /*) Створити клас Tree із перевантаженими конструкторами.
У класі є Tree є поля:
String type; int height, int coutOfsticks, String colour;
Конструктор1 приймає параметри String type; int height
і присвоює значення полям coutOfsticks значення 13, колір "Зелений".
Конструктор2 приймає в параметри int height, int coutOfsticks,
String colour і присвоює значення полю type "ялиця".
Констуктор за замовчуванням 3, який надає height = 350, coutOfsticks = 29, сolour = "Жовтий".
Конструктор4 який приймає параметри String type, і викликає у собі конструктор 3.
Створити в окремому класі main 4 об'єкти класу Tree використовуючи 4 створені конструктори.*/
    public String type;
    public int height;
    public int countOfSticks;
    public String color;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.color = "Зелений";
    }
    public Tree(int height, int countOfsticks, String color) {
        this.type = "Ялиця";
        this.height = height;
        this.countOfSticks = countOfsticks;
        this.color = color;
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.color = "Жовтий";
    }

    public Tree(String type) {
        this();
        this.type = type;
    }

    public void treeInfo() {
        System.out.println("Тип: " + type + ", Висота: " + height +
                ", Кількість гілок: " + countOfSticks +
                ", Колір: " + color);
    }
}
