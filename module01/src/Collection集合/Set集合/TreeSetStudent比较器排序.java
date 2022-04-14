package Collection集合.Set集合;
import classes.Student;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStudent比较器排序 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getAge()-o2.getAge();
                if(num==0){
                    num= o1.getName().compareTo(o2.getName());
                }
                return num;
            }
        });

        Student s1 = new Student("libai", 20);
        Student s2 = new Student("dufu", 25);
        Student s3 = new Student("wang", 20);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);
    }
}
