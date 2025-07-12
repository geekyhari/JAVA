package ObjectOrientedProgramming;

class A2{
    public void show(){
        System.out.println("in A");
    }
}
class B2 extends A2{
    public void show(){
        System.out.println("in B");
    }
}
class C2 extends A2{
    public void show(){
        System.out.println("in C");
    }
}

public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.show();

        obj = new B2();
        obj.show();
    }
}
