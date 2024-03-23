package hw1;

public class Task2 {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;

        System.out.println(x);
        System.out.println(y);
        System.out.println (z);
    }
}
