package 特殊操作流;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class System_in {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; //public static final InputStream in  字节流
        InputStreamReader reader = new InputStreamReader(in);

        int x;
        while((x=reader.read())!=-1){
            System.out.println((char)x);
            System.out.println("---");
        }
        in.close();
    }
}
