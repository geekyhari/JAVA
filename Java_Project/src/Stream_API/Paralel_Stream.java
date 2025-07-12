package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Paralel_Stream {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random rn = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(rn.nextInt(100));
        }

//        int sum1 = nums.stream()
//                .map(n -> n*2)
//                .reduce(0,(c,e) -> c+e);

        long start1 = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(n -> n*2)
                .mapToInt(n -> n)
                .sum();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(n -> n*2)
                                .mapToInt(n -> n)
                                        .sum();
        long end2 = System.currentTimeMillis();

//        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println("Time1 :" + (end1 - start1));
        System.out.println(sum3);
        System.out.println("Time2 :" + (end2 - start2));

    }
}
