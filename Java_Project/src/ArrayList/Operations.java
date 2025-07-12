package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(3);

        int ele = list.get(1); // prints the index
        System.out.println(ele);

        list.add(1,1);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int s = list.size();
        System.out.println(s);

        for (int i = 0; i < s; i++) {
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
