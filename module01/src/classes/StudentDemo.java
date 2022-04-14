package classes;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student(56, "李白");
        Student s1=new Student(56,"李白");
        System.out.println(s.equals(s1));
        System.out.println(s);
        System.out.println(s.getName() + s.getAge());
        s.setAge(18);
        s.setName("张飞");
        System.out.println(s.getName() + s.getAge());
    }
}
