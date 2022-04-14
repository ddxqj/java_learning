package 特殊操作流;

import java.io.*;
import java.util.Properties;

public class PropertiesIODemo {
    public static void main(String[] args) throws IOException{
        //mystore();
        myload();
    }

    private static void myload() throws IOException{
        Properties p = new Properties();
        //FileInputStream f=new FileInputStream("test.txt");
        FileReader f = new FileReader("test.txt");
        p.load(f);
        System.out.println(p);
        f.close();
    }

    private static void mystore() throws IOException {
        Properties p = new Properties();
        p.setProperty("liubei","50");
        p.setProperty("guanyu","40");
        p.setProperty("zhangfei","30");

        //FileOutputStream f=new FileOutputStream("test.txt");
        FileWriter f = new FileWriter("test.txt");
        p.store(f,"桃园结义");
        f.close();

    }
}
