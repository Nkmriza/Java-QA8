package hw8.computerTask1;

import java.util.Objects;

public class Computer {
    /*1) Створити клас Computer з конструктором, що приймає параметри Марка
    тип String, ціна тип int, оперативна пам'ять тип int, та відеокарта тип int.
Перевизначити метод toString для виведення об'єкта класу на слід. вигляді:
"Створено PC.
Ім'я = марка.
Ціна = ціна.
Відеокарта = обсяг відеокарти.
ОЗУ = Об'єм оперативної пам'яті."
Усі поля класу Computer мають бути приватними.

Також створіть публічні методи для отримання інформації про поля класу Computer.
А також методи зміни його полів.
*/

    private String name;
    private int price;
    private int memory;
    private int videoCard;

    public Computer(String name, int price, int memory, int videoCard) {
        this.name = name;
        this.price = price;
        this.memory = memory;
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Створено PC.\n" +
                "Ім'я = " + name + '\'' +
                ", Ціна = " + price +
                ", \"Відеокарта = " + memory +
                ", ОЗУ = " + videoCard;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public void Computer(String name, int price, int memory, int videoCard) {
        this.name = name;
        this.price = price;
        this.memory = memory;
        this.videoCard = videoCard;
    }
    /*Перевизначте метод equals та метод hashCode для вашого класу.
    Зробіть так, щоб комп'ютери вважалися однаковими у випадку, якщо у них:
    рівні значення полів марка, оперативна пам'ять та відеокарта.
    рівні значення полів марка, оперативна пам'ять та відеокарта.
    В окремому класі створіть об'єкт класу комп'ютер і виведіть
    у консоль інформацію про ваш об'єкт.*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return price == computer.price && memory == computer.memory && videoCard == computer.videoCard && Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, memory, videoCard);
    }
}
