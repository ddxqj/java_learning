package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MemberMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> aClass = Student.class;

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-------");

        Method[] methods1 = aClass.getMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
        System.out.println("-------");

        //例子
        Method m = aClass.getDeclaredMethod("show");
        m.setAccessible(true);
        Constructor<Student> c = aClass.getDeclaredConstructor();
        Student s = c.newInstance();
        m.invoke(s);
        System.out.println(s);
    }
}
