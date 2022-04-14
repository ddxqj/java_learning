package three;

import my.four.MyService;
import my.one.Student;
import my.two.Teacher;

import java.util.ServiceLoader;

public class test {
    public static void main(String[] args) {
//        Student s = new Student();
//        Teacher t = new Teacher();
//        s.study();
//        t.teach();

        ServiceLoader<MyService> load = ServiceLoader.load(MyService.class);
        System.out.println(load);
        for (MyService l : load) {
           l.Service();
        }
    }
}
