package hw2;

public class Hw2t3 {
    /*Спробувати, використовуючи метод split та інформацію з приводу поля length, вивести на екран кілька разів
символ 'a' зустрічається у рядку:
        "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method."


Розв'язати це завдання з обліків верхнього та нижнього регістру символу 'a'.*/

    public static void main(String[] args) {
        String randomText = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        int size = randomText.length();

        System.out.println(size);

        /*System.out.println(lowerCaseA.toUpperCase());
        System.out.println(upperCaseA.toLowerCase());*/

        String[] splitBySmallA = randomText.split("a");
        String[] splitByBigA = randomText.split("A");

        System.out.println("Total amount of a: " + splitBySmallA.length);
        System.out.println("Total amount of A: " + splitByBigA.length);

        String toLowerCaseA = randomText.toLowerCase();
        String[] generalA = toLowerCaseA.split("a");
        System.out.println(randomText.toLowerCase());
        System.out.println("General amount of a and A: " + generalA.length);
    }
}
