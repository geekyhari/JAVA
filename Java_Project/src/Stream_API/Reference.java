package Stream_API;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Stu{
    private String name;
    private int age;

    public Stu() {
    }

    public Stu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Reference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Lakshmi", "John", "Kishor");

//        String name = names.stream()
//                .filter(str -> str.contains("x"))
//                .findFirst()
//                .orElse("Not Found");
//        System.out.println(name);
//
//        List<String> un = names.stream()
//                .map(String::toUpperCase)   //Method Reference-
//                .toList();
//        System.out.println(un);
//        un.forEach(System.out::println);    //Method Reference

        //Constructor Reference

        List<Stu> students = new ArrayList<>();

//        for (String name: names){
//            students.add(new Stu(name));
//        }
        students = names.stream()
                        .map(Stu::new)
                                .toList();
        System.out.println(students);

    }
}
