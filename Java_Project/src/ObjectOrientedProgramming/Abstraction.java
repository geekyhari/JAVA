package ObjectOrientedProgramming;

abstract class Animal{
    Animal(){ // Constructor
        System.out.println("created new Animal");
    }
    abstract void walk();
    public void eats(){

        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){ // Constructor
        System.out.println("created a Horse");
    }
    public void walk(){

        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){

        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }
}
