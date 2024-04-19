package hw9;

public class HappyFamily {
    public static void main(String[] args) {
           /*Human mother = new Human("Ніка");
            Human father = new Human("Діма");*/
        System.out.println("Cім'я Бойко:");
        Human mother = new Human("Ніка", "Бойко", 1992, 120, "Бобік", null, null);
        Human father = new Human("Діма", "Бойко", 1985, 95, "Бобік", null, null);
        Human child = new Human("Марина", "Бойко", 2020, mother, father);
        Human child2 = new Human("Вася", "Бойко", 2022, mother, father);
        String[] habits = {"гавкає", "кусається"};
        Pet pet = new Pet("cобака", "Бобік", 3, 20, habits);
        Family family = new Family(mother, father);
        family.addChild(child);
        family.addChild(child2);
        family.setPet(pet);
        System.out.println(family);
        mother.describePet(pet);
        System.out.println();
        pet.respond();
        mother.greetPet(pet);

        System.out.println("\n" + "Cім'я Петренко:");
        Human mother2 = new Human("Маріна","Петренко", 1988);
        Human father2 = new Human("Олег","Петренко",1985);
        Human child3 = new Human ("Іван", "Петренко",2023);
        Human child4 = new Human (null, null,0);
        String [] habits2 = {"царапається","муркотить"};
        Pet pet2 = new Pet("кішка","Мурка", 5, 90, habits2);
        Family family2 = new Family(mother2,father2);
        family2.deleteChild(child4);
        family2.addChild(child3);
        family2.setPet(pet2);
        System.out.println(family2);
        pet2.foul();
        father2.feedPet(pet2);
        System.out.println();
        father2.describePet(pet2);

        System.out.println("Сім'я Васько:");
        Human mother3 = new Human("Ліля","Васько", 1950, null,null);
        Human father3 = new Human("Федір","Васько",1949, null,null);
        Pet pet3 = new Pet("кролик", "Вухастий");
        Family family3 = new Family(mother3,father3);
        family3.setPet(pet3);
        pet3.eat();
        System.out.println(family3);

    }

}
