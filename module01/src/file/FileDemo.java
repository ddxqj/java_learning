package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("D:\\Files\\java\\IDEA_workspace\\java.txt");
        System.out.println(f);

        File f1=new File("D:\\Files","java\\IDEA_workspace\\java.txt");
        System.out.println(f1);

        File f2=new File("D:\\Files\\java");
        File f3=new File(f2,"IDEA_workspace\\java.txt");
        System.out.println(f3);
    }
}
