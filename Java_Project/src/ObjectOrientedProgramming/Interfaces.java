package ObjectOrientedProgramming;

interface Animal1{
    void walk();
}

interface Herbivore{
}

class Horse1 implements Animal1,Herbivore{
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse1 horse = new Horse1();
        horse.walk();
    }
}
