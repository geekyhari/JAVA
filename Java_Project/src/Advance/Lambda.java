package Advance;

@FunctionalInterface
interface bA{
    int add(int i, int j);
}

@FunctionalInterface
interface hello{
    void hi();
}

public class Lambda {
    public static void main(String[] args) {
        bA ba = (i,j) -> i+j;

        hello h = () -> System.out.println("hello from lambda");


        System.out.println(ba.add(4,5));
        h.hi();
    }
}
