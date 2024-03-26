package hw2;

public class Hw2t1 {
    /*Створити змінну string1 = "This line that i want to cut, cause it is too long".
    Створити рядок string2 у якому має бути розміщено значення рядка string1,
    Обрізане до "This line that i want to cut, cause".
    Створити рядок string3 на основі string2 який міститиме значення
    "This line that don't want to cut, cause it is perfect".
    Вивести на консоль кожне повідомлення та його довжину.*/
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2;

        string2 = string1.substring(0, string1.length() - 15);

        String string3;
        string3 = string2.concat(" ").concat("it is perfect");

        System.out.println(string1 + " " + string1.length());
        System.out.println(string2 + " " + string2.length());
        System.out.println(string3 + " " + string3.length());


    }
}
