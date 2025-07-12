package Advance;

class AB extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }
}

class BA extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {

        AB obj1 = new AB();
        BA obj2 = new BA();

        obj1.start();
        obj2.start();
    }
}
