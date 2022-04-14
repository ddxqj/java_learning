package 字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPhoto {
    public static void main(String[] args) throws IOException {
        FileInputStream s1 = new FileInputStream("C:\\Users\\Tao\\Pictures\\Saved Pictures\\竖屏3.jpg");
        FileOutputStream s2 =new FileOutputStream("test.jpg");

        byte[] bytes =new byte[1024];
        int len;
        while((len = s1.read(bytes))!=-1){
            s2.write(bytes,0,len);
        }
        s1.close();
        s2.close();
    }
}
