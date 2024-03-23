package hw1;

public class Task1 {
    public static void main(String[] args) {
        int mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        int volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        int opel = mercedes%volvo;

        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println (opel);
    }
}
