package 字符流;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("test.txt"));
        FileWriter writer1 = new FileWriter("test.txt");

        writer.write(97);
        //writer.flush();
        writer.write(98);
        writer.flush();

        char[] c={'a','b','c','d','e'};
        writer.write(c);
        writer.write(c,3,2);

        String s ="合肥工业大学";
        writer.write(s);
        writer.write(s,1,3);

        //writer.close();

    }
}
