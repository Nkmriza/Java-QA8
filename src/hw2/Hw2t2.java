package hw2;

public class Hw2t2 {
    /*Створити рядок string = .
    Вивести на екран окремо кожне слово та довжину цього слова у вигляді:
    Слово1 = (значення слова), Довжина цього слова = (значення довжини слів).
    Слово2 = (значення слова), Довжина цього слова = (значення довжини слів).
    і т.д.
    Вивести на консоль true, якщо перше слово довше інших, в іншому випадку вивести false.*/
    public static void main(String[] args) {
        String mainString = "Testing, is my favourite job";
        String word1 = "Testing";
        int length1 = word1.length();
        String word2 = "is";
        int length2 = word2.length();
        String word3 = "my";
        int length3 = word3.length();
        String word4 = "favourite";
        int length4 = word4.length();
        String word5 = "job";
        int length5 = word5.length();

        System.out.println("Слово = " + word1 + ", " + "довжина слова = " + length1);
        System.out.println("Слово = " + word2 + ", " + "довжина слова = " + length2);
        System.out.println("Слово = " + word3 + ", " + "довжина слова = " + length3);
        System.out.println("Слово = " + word4 + ", " + "довжина слова = " + length4);
        System.out.println("Слово = " + word5 + ", " + "довжина слова = " + length5);

        if ((length1 > length2) && (length1 > length3) && (length1 > length4) && (length1 > length5)) {
            System.out.println("true");
        } else System.out.println("false");

        System.out.println("============");

        boolean fisrtWordIsBigger = length1 > length2;
        boolean fisrtWordIsBigger1 = length1 > length3;
        boolean fisrtWordIsBigger2 = length1 > length4;
        boolean fisrtWordIsBigger3 = length1 > length5;
        System.out.println(fisrtWordIsBigger);
        System.out.println(fisrtWordIsBigger1);
        System.out.println(fisrtWordIsBigger2);
        System.out.println(fisrtWordIsBigger3);
        //Шось таке собі наробила...//
    }
}
