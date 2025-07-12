package Collections_API;
import java.util.*;
import java.util.function.Consumer;

public class BAsics {
    public static void main(String[] args) {

        //Sets
        Set<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(6);
        nums.add(5);
        nums.add(4);

        for(int n : nums){
            System.out.println(n);
        }

        //Maps
        Map<String, Integer> Students = new Hashtable<>();

        Students.put("Shrihari", 104);
        Students.put("Navin", 105);
        Students.put("Harsh", 106);
        Students.put("Shrihari", 107);


        System.out.println(Students);
        System.out.println(Students.get("Shrihari"));
        System.out.println(Students.keySet());

        for(String s : Students.keySet()){
            System.out.println(s + " : " + Students.get(s));
        }

        //List
        List<Integer> list = Arrays.asList(4,5,1,2,3,8);

        Consumer<Integer> con = n ->System.out.println(n);

//        list.forEach(n -> System.out.println(n));
        list.forEach(con);

    }
}
