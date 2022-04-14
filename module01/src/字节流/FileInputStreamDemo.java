package 字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("test.txt");

//        int read = stream.read();
//        while(read!=-1){
//            System.out.print((char)read);
//            read = stream.read();
//        }

//        byte[] read =new byte[5];
//        int len =stream.read(read);
//        System.out.println(len);
//        System.out.println(new String(read,0,len));

//        int len1 =stream.read(read);
//        System.out.println(len1);
//        System.out.println(new String(read,0,len1));


        byte[] read =new byte[5];
        int len;
        while((len =stream.read(read))!=-1){
            System.out.println(new String(read,0,len));
        }

        stream.close();
    }
}
