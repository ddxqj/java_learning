package classes;

import java.util.Objects;

public class Student {
    public Student(){
        System.out.println("默认构造一个Student！");
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("name和age构造一个Student！");
    }
    public Student(int age,String name){
        this.name = name;
        this.age = age;
        System.out.println("age和name构造一个Student！");
    }
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

//    @Override
//    public int compareTo(Student o) {
//        int num=this.age-o.age;
//        if(num==0){
//            num= this.name.compareTo(o.name);
//        }
//        return num;
//    }

//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
//        return result;
//    }


}
