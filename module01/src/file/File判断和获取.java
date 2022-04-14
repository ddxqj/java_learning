package file;

import java.io.File;

public class File判断和获取 {
    public static void main(String[] args) {
        File f = new File("D:\\Files\\java\\IDEA_workspace");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println("---");

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("---");

        String[] strarr =f.list();
        for (String s : strarr) {
            System.out.println(s);
        }
        System.out.println("---");

        File[] filearr =f.listFiles();
        for (File file : filearr) {
            System.out.println(file);
        }
    }
}
