package hw9;

import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String pet;
   private Human mother;
    private Human father;
    private Family family;


    public void greetPet(Pet pet) {
        System.out.println("Привіт, " + pet.getNickname() + "!");
    }

    public void feedPet(Pet pet){
        System.out.println("Мабуть, ти голодна...");
    }

    public void describePet(Pet pet) {
       /* if (pet.getTrickLevel() > 50){
            System.out.println("дуже хитрий");}
        else if (pet.getTrickLevel() <= 50) {
            System.out.println("майже не хитрий");
        }*/
        String trickLevel = (pet.getTrickLevel() > 50) ? "дуже хитрий" : "майже не хитрий";
        System.out.println("У мене є " + pet.getSpecies() + " їй " + pet.getAge() + " років, він " + trickLevel);
    }

    public Human(String name, String surname, int year){

        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, String pet, Human mother, Human father) {
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

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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
        return "ім'я = " + name +
                ", прізвище = " + surname +
                ", рік = " + year +
                ", IQ = " + iq /*+ " mother " + mother +
                ", father= " + father +
                ", pet= "+ pet*/;
    }

}