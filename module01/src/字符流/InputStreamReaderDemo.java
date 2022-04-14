package 字符流;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("test.txt"));
        FileReader reader1 = new FileReader("test.txt");


//        int read;
//        while((read = reader.read())!= -1){
//            System.out.println((char)read);
//        }

        char[] chs =new char[1024];
        int len;
        while((len = reader.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }

        reader.close();
    }
}
