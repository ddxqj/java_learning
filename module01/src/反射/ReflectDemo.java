package 反射;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1==c2);//true

        Student student = new Student();
        Class<? extends Student> c3 = student.getClass();
        System.out.println(c1==c3);//true

        Class<?> c4 = Class.forName("反射.Student");
        System.out.println(c1==c4);//true
    }
}
