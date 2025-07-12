package ObjectOrientedProgramming;

import org.w3c.dom.ls.LSOutput;

class Human{
    private String name;
    private int age;

    public Human(){ // Default Constructor
        name = "Shrihari";
        age = 18;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human("Amogh",19);
        System.out.println(obj.getAge()+" "+ obj1.getAge());

    }


}
