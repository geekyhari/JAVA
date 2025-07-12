package ObjectOrientedProgramming;
class Pen{
    String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;


    //printinfo - method overloading -> polymorphism(compile time)
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name, int age){
        System.out.println(name + " " + age);
    }

    Student() { // non parametrized
        System.out.println("Constructor");
    }

    Student(String name, int age){ // parametrized constructor
        this.name = name;
        this.age = age;
    }

    Student(Student s1){ // copy constructor
        this.name = s1.name;
        this.age = s1.age;
    }

}

public class Class {
    public static void main(String[] args) {

//        Pen pen1 = new Pen();
//        pen1.color = "green";
//        pen1.type = "gel";
//        pen1.write();
//        pen1.printcolor();
//        pen1.printtype();
//
//        Pen pen2 = new Pen();
//        pen2.color = "Black";
//        pen2.type = "Ball";
//        pen2.printcolor();
//        pen2.printtype();

        Student s1 = new Student();
        s1.name = "shri";
        s1.age = 19;
//        s1.printinfo();

//        Student s2 = new Student("shrihari",19);
//        s2.printinfo();

        Student s3 = new Student(s1);
        s3.printinfo();
        s3.printinfo(s3.age);
        s3.printinfo(s3.name);
        s3.printinfo(s3.name,s3.age);
    }
}
