package Advance;

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class Race_Condition {
    public static void main(String[] args) {

        Counter c = new Counter();
        Runnable obj1 = () ->
        {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.count);
    }
}
