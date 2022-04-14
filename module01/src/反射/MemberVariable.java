package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MemberVariable {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> aClass = Student.class;

        Field[] fs = aClass.getFields();
        for (Field f : fs) {
            System.out.println(f);
        }
        System.out.println("--------");

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------");

        //具体的例子
        Field f = aClass.getDeclaredField("address");
        Constructor<Student> c = aClass.getDeclaredConstructor();
        Student s = c.newInstance();
        f.set(s,"安徽省六安市");
        System.out.println(s);
    }
}
