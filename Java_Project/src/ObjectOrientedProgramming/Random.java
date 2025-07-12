package ObjectOrientedProgramming;

class hello{
    private int age;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Random {
    public static void main(String[] args) {
    hello h1 = new hello();
    h1.setAge(19);
    h1.setName("Shrihari");
    System.out.println(h1.getAge());
    System.out.println(h1.getName());
    }
}
