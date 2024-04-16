package hw8.computerTask1;

import hw8.computerTask1.Computer;

public class ComputerMainTask1 {
    public static void main(String[] args) {
        Computer comp = new Computer("mac", 1000, 8, 512);
        Computer comp2 = new Computer("Asus", 400, 8, 128);
        Computer comp3 = new Computer("Asus", 400, 8, 128);
        System.out.println(comp);
        System.out.println(comp2);
        System.out.println(comp3);
        boolean compareComputers = comp.equals(comp2);
        boolean compareComputers2 = comp2.equals(comp3);
        System.out.println();
        System.out.println(compareComputers);
        System.out.println(compareComputers2);
    }

}
