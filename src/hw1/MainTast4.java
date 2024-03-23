package hw1;

public class MainTast4 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = b++ *2 - ++a;
        b = (a/b);

        System.out.println(a);
        System.out.println(b);
    }
}
