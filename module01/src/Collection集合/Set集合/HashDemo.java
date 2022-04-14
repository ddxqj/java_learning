package Collection集合.Set集合;

import classes.Student;

public class HashDemo {
    public static void main(String[] args) {
        String s ="xuhao";
        String s1="xuhao";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        Student st =new Student("libai",30);
        Student st1 =new Student("libai",30);
        System.out.println(st.hashCode());
        System.out.println(st1.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
