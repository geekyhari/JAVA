package Advance;

interface A{

    int age = 19;       //variables in interfaces are final and static
    String name = "Shrihari";

    void show();
    void config();
}
interface X{
    void run();
}

interface Y extends X{

}

//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

class B implements A,X{

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("running...");
    }
}
public class Interfaces {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.age);
    }
}
