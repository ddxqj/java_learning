package 特殊操作流;

import java.io.PrintStream;

public class System_out {
    public static void main(String[] args) {
        PrintStream out = System.out;  //public static final PrintStream out  字节流

        out.print("hello");
        out.println("world");
    }
}
