package hw9;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    /*Опишіть у класі Pet такі поля:
• вид тварини (species), рядок (собака, кіт тощо)
• кличка (nickname)
• вік (age)
• Рівень хитрості (trickLevel) (ціле число від 0 до 100)
• звички (habits) (масив рядків)


Опишіть у класі Pet та реалізуйте такі методи:
• поїсти (eat) (метод виводить на екран повідомлення Я ї'м!)
• відгукнутися (respond) (метод виводить на екран повідомлення Привіт,
хазяїн. Я - [ім'я тварини]. Я скучив!)
• зробити домашню гидоту (foul) (метод виводить на екран повідомлення
Потрібно добре замести сліди...)

У класі Pet створіть конструктори:
• конструктор, що описує вид тварини та її прізвисько
• конструктор, що описує всі поля тварини
• Порожній конструктор*/

    private String species;
    private String nickname;
    private  int age;
    private int trickLevel;
    private String [] habits;

    public void eat (){
        System.out.println("Я їм!");
    }

    public void respond () {
        System.out.println("Привіт, хазяїн. Я - " + nickname +". Я скучив!");
    }

    public void foul (){
        System.out.println("Потрібно добре замести сліди...");
    }

    public Pet (String species, String nickname){
        this.nickname = nickname;
        this.species = species;
    }
    public Pet(String species, String nickname, int age, int trickLevel, String [] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(){}

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public String toString() {
        return species + "{"+
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';

    }
}
