package 方法引用.引用构造方法;

public class StudentDemo {
    public static void main(String[] args) {
        useStudentBuilder( Student::new );
    }
    private static void useStudentBuilder(StudentBuilder s){
        Student ss = s.build("liubei",30);
        System.out.println(ss);
    }
}
