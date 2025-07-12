package Collections_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Comparator_Comparable {
    public static void main(String[] args) {

        Comparator<Student> com = (o1, o2) -> (o1.age > o2.age) ? 1 :-1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Shrihari", 19));
        studs.add(new Student("Harsh", 22));
        studs.add(new Student("Navin", 24));
        studs.add(new Student("Reddy", 15));

//        System.out.println(studs);
//        nums.sort(com);
//        Collections.sort(nums);

//        Collections.sort(studs,com); //can be used with a Comparator
//        Collections.sort(studs); //if a class implements Comparable
        studs.sort(com); // Comparator
//
        for(Student s : studs){
            System.out.println(s);
        }



    }
}
