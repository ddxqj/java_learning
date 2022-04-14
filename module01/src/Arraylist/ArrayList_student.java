package Arraylist;
import classes.Student;

import java.util.ArrayList;

public class ArrayList_student {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student s1=new Student("liubei",45);
        Student s2=new Student("guanyu",40);
        Student s3=new Student("zhangfei",35);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        for(int i=0;i<studentArrayList.size();i++){
            Student s=studentArrayList.get(i);
            System.out.println(s.getName()+s.getAge());
        }

    }
}
