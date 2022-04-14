package 特殊操作流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test.txt"));

        Object o = inputStream.readObject();
        //Student s = (Student)o;
        System.out.println(o);

        inputStream.close();
    }
}
