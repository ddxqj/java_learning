package 字符流;

import java.io.*;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("test.txt"),"UTF-8");
        writer.write("中国");
        writer.close();

        InputStreamReader reader = new InputStreamReader(new FileInputStream("test.txt"));
        int x;
        while((x =reader.read())!=-1){
            System.out.println((char)x);
        }
        reader.close();

    }
}
