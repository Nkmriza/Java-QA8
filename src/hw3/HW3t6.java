package hw3;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class HW3t6 {
    /*Використовуючи оператор switch написати програму, яка виводить на консоль
     посилання для завантаження програми. З вибору програм взяти: IntelliJ IDEA,
     Git, Java. З вибору ОС взяти: Linux, MacOS, Windows. Програма повинна запитати
      користувача, яка програма йому цікава, також запитати яку ОС він використовує,
      а після вивести в консоль необхідне посилання. Якщо програма з такою назвою не
      виводить повідомлення в консоль, про те, що такої програми не існує. Якщо зазначеної
      користувачем ОС немає, виводиться повідомлення в консоль, що такої ОС немає.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Яка програма вас цікавить?");
        String prog = scanner.nextLine();
        System.out.println("Якою ОС ви користуєтесь?");
        String os = scanner.nextLine();
        /*String intelIde = "IntelliJ IDEA";*/
        switch (prog.toLowerCase()) {
            case "intellij idea":
                System.out.println("IntelliJ IDEA");
                switch (os.toLowerCase()) {
                    case "linux":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                        break;
                    case "macos":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                        break;
                    case "windows":
                        System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                    default:
                        System.out.println("Немає зазначеної ОС");
                }
                break;
            case ("git"):
                System.out.println("Git");
                switch (os.toLowerCase()) {
                    case "linux":
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    case "macos":
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case "windows":
                        System.out.println("https://git-scm.com/download/win");
                    default:
                        System.out.println("Немає зазначеної ОС");
                }
                break;
            case ("java"):
                System.out.println("Java");
                switch (os.toLowerCase()) {
                    case "linux":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/");
                        break;
                    case "macos":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/");
                        break;
                    case "windows":
                        System.out.println("https://www.oracle.com/java/technologies/downloads/");
                    default:
                        System.out.println("Немає зазначеної ОС");
                }
                break;

            default:
                System.out.println("Такої програми не існує");
                break;


        }
        scanner.close();
    }

}

