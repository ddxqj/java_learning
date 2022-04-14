package 字符流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));

//        int read;
//        while((read = reader.read())!= -1){
//            System.out.println((char)read);
//        }

//        char[] chs =new char[1024];
//        int len;
//        while((len = reader.read(chs))!=-1){
//            System.out.println(new String(chs,0,len));
//        }

        String s;
        while((s =reader.readLine())!=null){
            System.out.print(s);
            System.out.print("---");
        }

        reader.close();
    }
}
