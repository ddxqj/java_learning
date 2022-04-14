package file;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f=new File("D:\\Files\\gitcode\\sth_sth_v1");

        delete(f);
    }
    public static void delete(File f){
        if(f==null) return;
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for (File file : files) {
                    delete(file);
            }
            f.delete();
            System.out.println(f.getPath()+"已被删除");
        }
        else if(f.isFile()){
            f.delete();
            System.out.println(f.getPath()+"已被删除");
        }
    }
}
