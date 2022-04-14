package file;

import java.io.File;
import java.io.IOException;

public class File创建 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Files\\java\\IDEA_workspace\\java.txt");
        System.out.println(f.createNewFile());

//        File f1 = new File("D:\\Files\\java\\IDEA_workspace\\test");
//        System.out.println(f1.mkdir());
//
//        File f2 = new File("D:\\Files\\java\\IDEA_workspace\\test1\\test2");
//        System.out.println(f2.mkdirs());
//
//        File f3=new File("D:\\Files\\java\\IDEA_workspace\\java.txt");
//        System.out.println(f3.mkdir());
    }
}
