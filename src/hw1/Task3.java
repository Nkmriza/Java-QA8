package hw1;

public class Task3 {
    public static void main(String[] args) {
        boolean a = (85 / 5 + (19 - 25 % 3)) == (-3) * (-2 + 14 / (-2)) && (2 % 7 - 1) * 3 <= 2;
        boolean b = !a || a && !a;
        boolean c = false && !true || !((23 % 3 + 14) % 3 == 7);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
