package 特殊操作流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("test.txt");
        PrintWriter pw1 = new PrintWriter(new FileWriter("test.txt"),true);

        pw1.write("加油");
        pw1.println("抗议");

        pw.write(97);
        pw.write("\n");
        pw.println("中国");


    }
}
