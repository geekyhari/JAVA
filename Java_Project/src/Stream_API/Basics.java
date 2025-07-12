package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basics {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,1,2,3,8);

//        Stream<Integer> s1 = list.stream();     //Stream can only be used once
//        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int result = s3.reduce(0,(c,e) -> c+e);
        int result = list.stream()
                        .filter(n -> n%2 == 0)      //Predicate
                                .map(n -> n*2)      //Function
                                        .reduce(0, (c, e) -> c+e);

        Stream<Integer> sv = list.stream()
                        .filter(n -> n%2 == 0)
                                .sorted();
        sv.forEach(n -> System.out.println(n));
        System.out.println(result);
//        list.forEach(n -> System.out.println(n));

    }
}
