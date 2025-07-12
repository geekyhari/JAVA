package ObjectOrientedProgramming;

class A {
    public A(){
        System.out.println("in A");
    }
    public A(int a){
        System.out.println("in PC of A");
    }
}
class B extends A{
    public B(){
        super(); // this is already present not need to write it explicity
        System.out.println("in B");
    }
    public B(int a){
//        super(a);
        this();
        System.out.println("in PC of B");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        B obj = new B(8);
    }
}
