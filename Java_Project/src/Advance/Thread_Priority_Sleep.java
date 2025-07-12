package Advance;
class ABc extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BAc extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread_Priority_Sleep {
    public static void main(String[] args) {

        ABc obj1 = new ABc();
        BAc obj2 = new BAc();

//        obj2.setPriority(Thread.MAX_PRIORITY); // MAX = 10 , MIN = 1 , NORM = 5
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}
