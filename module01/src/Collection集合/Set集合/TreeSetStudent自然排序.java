package Collection集合.Set集合;

import java.util.TreeSet;

public class TreeSetStudent自然排序 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("libai", 20);
        Student s2 = new Student("dufu", 25);
        Student s3 = new Student("wang", 20);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);
    }
}
