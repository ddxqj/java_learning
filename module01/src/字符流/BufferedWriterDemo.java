package 字符流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));

        writer.write(97);
        writer.write(98);
        writer.newLine();

        char[] c={'a','b','c','d','e'};
        writer.write(c);
        writer.write(c,3,2);
        writer.newLine();

        String s ="合肥工业大学";
        writer.write(s);
        writer.write(s,1,3);
        writer.newLine();

        writer.close();
    }
}
