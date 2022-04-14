package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> aClass = Student.class;

        //Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<?>[] cs = aClass.getDeclaredConstructors();
        for (Constructor<?> c : cs) {
            System.out.println("所有构造方法："+c);
        }

        Constructor<Student> c = aClass.getDeclaredConstructor(int.class,String.class);
        System.out.println("构造方法："+c);
        c.setAccessible(true);
        Student s = c.newInstance(30,"liubei");
        System.out.println(s);
    }
}
