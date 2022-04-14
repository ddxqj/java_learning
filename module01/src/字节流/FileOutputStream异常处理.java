package 字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream异常处理 {
    public static void main(String[] args) {
        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream("test.txt", true);
            stream.write(96);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
