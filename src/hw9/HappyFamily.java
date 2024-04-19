package hw9;

public class HappyFamily {
    public static void main(String[] args) {
           /*Human mother = new Human("Nika");
            Human father = new Human("John");*/
        Human mother = new Human("Ніка", "Бойко", 1992, 120, "Бобік", null, null);
        Human father = new Human("Діма", "Бойко", 1985, 95, "Бобік", null, null);
        Human child = new Human("Марина", "Бойко", 2020, mother, father);
        Human child2 = new Human("Вася", "Бойко", 2022, mother, father);
        String[] habits = {"гавкає", "кусається"};
        Pet pet = new Pet("cобака", "Бобік", 3, 60, habits);
        Family family = new Family(mother, father);
        family.addChild(child);
        family.addChild(child2);
        family.setPet(pet);
        System.out.println(family);
        mother.describePet(pet);
        System.out.println();
        pet.respond();
        mother.greetPet(pet);

    }

}
