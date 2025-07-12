package Advance;

class Ab{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Advance.Throws_keyword");
    }
}

public class Throws_keyword {

    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {

        Ab obj = new Ab();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
