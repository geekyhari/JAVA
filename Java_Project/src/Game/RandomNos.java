package Game;
import java.util.Random;
public class RandomNos {
    public static void main(String[] args) {
        Random rn = new Random();

        //Generation of random nos
        int ran_no = rn.nextInt(5); // 0 to n
        System.out.println(ran_no);
    }
}
