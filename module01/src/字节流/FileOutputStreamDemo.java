package 字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream stream = new FileOutputStream("test.txt",true);
        //FileOutputStream stream = new FileOutputStream(new File("test.txt"));

        stream.write("\n".getBytes());
        stream.write(10);

        stream.write(97);
        stream.write(98);
        stream.write(99);

        byte[] bys ={100,101,102};
        stream.write(bys);


        byte[] bytes = "ghi".getBytes();
        stream.write(bytes,0,3);

        //stream.close();
    }
}
