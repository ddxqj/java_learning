package Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapStudent {
    public static void main(String[] args) {
        HashMap<Student,String> stmap = new HashMap<>();

        Student s1 = new Student("libai", 20);
        Student s2 = new Student("dufu", 25);
        Student s3 = new Student("wang", 20);
        Student s4 = new Student("dufu", 25);

        stmap.put(s1,"01");
        stmap.put(s2,"02");
        stmap.put(s3,"03");
        stmap.put(s4,"04");

        Set<Student> students = stmap.keySet();
        for (Student s : students) {
            System.out.println(s+" "+stmap.get(s));
        }
    }
}
