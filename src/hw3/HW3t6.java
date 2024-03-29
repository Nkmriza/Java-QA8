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
        switch (prog.toLowerCase()){
            case ("IntelliJ IDEA"):System.out.println("IntelliJ IDEA");
            break;
            case ("Git"):System.out.println("Git");
            break;
            case ("Java"):System.out.println("Java");
            break;

        default:
            System.out.println("Такої програми не існує");
        break;}



      /*  System.out.println("Якою ОС ви користуєтесь?");
         String oS = scanner.nextLine();*/


    }
}
