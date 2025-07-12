package Arrays_;

import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,1);
        arr.add(1,2);
        arr.add(2,3);
        arr.add(3,4);
        arr.add(4,5);
        arr.add(5,6);
        System.out.println(arr);
        System.out.println(arr.size());

        arr.add(6,7);   
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
