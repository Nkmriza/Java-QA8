package hw8.converterTask3;

import java.util.Scanner;

/*Необхідно створити клас конвертер, який матиме методи конвертації примітивних типів даних:
метод convertToInt;
(Конвертує byte, short, int, long, char, float, double, String).
При введенні boolean виводить повідомлення, що введено тип boolean.
convertToDouble; (Конвертує byte, short, int, long, char, float, double, String).
При введенні boolean виводить повідомлення, що введено тип boolean.
convertToString; (Конвертує byte, short, int, long, char, boolean, float, double, String).
 Цей клас повинен мати лише один конструктор, у параметрах якого можна вказати його ім'я.
 А також лише один метод геттер для отримання інформації про назву конвертру.*/
public class Converter {
    private String name;

    public void convertToInt(byte b, short s, int i, long l, char c, float f, double d, String string) {
        int convByte = Integer.parseInt(String.valueOf(b));
        int convShort = Integer.parseInt(String.valueOf(s));
        int convInt = Integer.parseInt(String.valueOf(i));
        int convLong = Integer.parseInt(String.valueOf(l));
        int convChar = Integer.parseInt(String.valueOf(c));
        int convFloat = (int) f;
        int convDouble = (int) d;
        int convString = Integer.parseInt(string);
        System.out.println("Конвертація в integer: \n" + convByte + " " + convShort + " " + convInt + " " + convLong + " " + convChar + " " + convFloat + " " + convDouble + " " + convString);

    }

    public void convertToDouble(byte b, short s, int i, long l, char c, float f, double d, String string) {
        double convByte = Integer.parseInt(String.valueOf(b));
        double convShort = Integer.parseInt(String.valueOf(s));
        double convInt = Integer.parseInt(String.valueOf(i));
        double convLong = Integer.parseInt(String.valueOf(l));
        double convChar = Integer.parseInt(String.valueOf(c));
        double convFloat = Double.parseDouble(String.valueOf(f));
        double convDouble = d;
        double convString = Double.parseDouble(string);
        System.out.println("Конвертація в double: \n" + convByte + " " + convShort + " " + convInt + " " + convLong + " " + convChar + " " + convFloat + " " + convDouble + " " + convString);
    }

    public void convertToString(byte b, short s, int i, long l, char c, float f, double d, String string) {
        String convByte = String.valueOf(b);
        String convShort = String.valueOf(s);
        String convInt = String.valueOf(i);
        String convLong = String.valueOf(l);
        String convChar = String.valueOf(c);
        String convFloat = String.valueOf(f);
        String convDouble = String.valueOf(d);
        String convString = string;
        System.out.println("Конвертація в String: \n" + convByte + " " + convShort + " " + convInt + " " + convLong + " " + convChar + " " + convFloat + " " + convDouble + " " + convString);
    }

    public void convertToInt(boolean value) {
        System.out.println();
        System.out.println("Введено тип boolean");
    }

    public void convertToDouble(boolean value) {
        System.out.println();
        System.out.println("Введено тип boolean");
    }

    public Converter(String name) {
        this.name = name;
        System.out.println(name + ": ");
    }

    public String getName() {
        return name;

    }

    /*public static void main(String[] args) {
        Converter conv = new Converter("Конвертер");
        conv.convertToInt((byte) 100, (short) 1, 500, 4L, '2', 34f, 23.2438, "1");
        conv.convertToDouble((byte) 4, (short) 23, 3456, 300L, '3', 3.454f, 5.528, "530");
        conv.convertToString((byte) 4, (short) 230, 30, 10L, '2', 657f, 14.7, "така маячня" );
        conv.convertToInt(true);
        conv.convertToDouble(false);
    }*/
}
