package 特殊操作流;


import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, NotSerializableException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test.txt"));
        Student s =new Student("刘义",18);

        outputStream.writeObject(s);

        outputStream.close();
    }
}
