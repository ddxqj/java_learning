package file;

import java.io.File;

public class 遍历目录 {
    public static void main(String[] args) {
        File f=new File("D:\\下载");
        getallpath(f);
    }

    public static void getallpath(File f){
        File[] files = f.listFiles();
        if(files!=null){
            for (File file : files) {
                if(file.isDirectory()){
                    getallpath(file);
                } else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
