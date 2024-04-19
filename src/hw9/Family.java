package hw9;

import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        if (children == null) {
            children = new Human[1];
            children[0] = child;
        } else {
            Human[] ch = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                ch[i] = children[i];
            }
            ch[ch.length - 1] = child;
            children = ch;
        }
    }

    public void deleteChild(Human child) {
        int index = getIdOfChild(child);
        if (index != -1) {
            children[index] = null;
            Human[] ch = new Human[children.length - 1];
            int counter = 0;
            for (int i = 0; i < children.length; i++) {
                if (children[i] == null) {
                    continue;
                }
                ch[counter] = children[i];
                counter++;
            }
            children = ch;
        }
    }

    private int getIdOfChild(Human child) {
        int idOfChild = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == child) {
                idOfChild = i;
                break;
            }
        }
        return idOfChild;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.pet = new Pet();
        mother.setFamily(this);
        father.setFamily(this);
    }

    @Override
    public String toString() {
        return "Сім'я: " + "\n" +
                mother + "\n" + father + "\n" +
                "діти: " + Arrays.toString(children) + "\n" +
                pet;
    }

   /* @Override
    public String toString() {
        return "Family "+ "\n" +
                "mother: " + mother +
                ", father: " + father +
                ", children: " + Arrays.toString(children) +
                ", pet: " + pet +
                '}';
    }*/
}
