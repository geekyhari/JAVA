package Advance;
class ABcd implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BAcd implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Runnables {
    public static void main(String[] args) {

        Runnable obj1 = new ABcd();
        Runnable obj2 = new BAcd();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
