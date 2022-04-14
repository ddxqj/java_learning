package 字节流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream s1 = new FileOutputStream("test.txt",true);
        BufferedOutputStream buffers1 = new BufferedOutputStream(s1);

        buffers1.write("123456789".getBytes("UTF-8"));

//        int[] arr ={1,2,3,4};
//        System.out.println(Arrays.toString(arr));


        buffers1.close();


    }
}
