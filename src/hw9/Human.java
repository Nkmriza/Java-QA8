package hw9;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String pet;
    private String mother;
    private String father;

    public void greetPet() {
        Pet pet = new Pet();
        System.out.println("Привіт" + pet.getNickname() + "!");
    }

    public void describePet() {
        Pet pet = new Pet();
        System.out.println("У мене є" + pet.getSpecies() + "їй" + pet.getAge() + " років, він" + pet.getTrickLevel());
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, String mother, String father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, String pet, String mother, String father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet, mother, father);
    }

    @Override
    public String toString() {
        Pet pet1 = new Pet();
        return "Human{" +
                "name= " + name + '\'' +
                ", surname= " + surname + '\'' +
                ", year= " + year +
                ", iq= " + iq +
                ", mother= " + mother + '\'' +
                ", father= " + father + '\'' +
                ", pet= " + pet + "{" + "nickname='" + pet1.getNickname() + '\'' +
                ", age=" + pet1.getAge() +
                ", trickLevel=" + pet1.getTrickLevel() +
                ", habits=" + Arrays.toString(pet1.getHabits()) +
                '}';
    }
}
