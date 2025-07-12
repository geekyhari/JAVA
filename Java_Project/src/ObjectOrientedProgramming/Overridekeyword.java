package ObjectOrientedProgramming;

class A1 {
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class B1 extends A1{
    @Override
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}


public class Overridekeyword {
    public static void main(String[] args) {
        B1 obj = new B1();
        System.out.println(obj.add(2,5));
    }
}
