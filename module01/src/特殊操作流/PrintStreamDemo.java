package 特殊操作流;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("test.txt");

        //一般方法
        ps.write(97);
        //ps.write(byte[] b);
        //ps.write(byte[] b,int offset,int length);

        //特有方法
        ps.print("中国");
        ps.println();
        ps.print(98);

        ps.close();
    }
}
