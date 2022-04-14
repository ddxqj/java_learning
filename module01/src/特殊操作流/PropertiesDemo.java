package 特殊操作流;

import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties p = new Properties();
        /*
        p.put("liubei",50);
        p.put("guanyu",40);
        p.put("zhangfei",30);

        Set<Object> set = p.keySet();
        for (Object o : set) {
            System.out.println(o+" "+p.get(o));
        }
        */
        p.setProperty("liubei","50");
        p.setProperty("guanyu","40");
        p.setProperty("zhangfei","30");


        Set<String> set = p.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+" "+p.getProperty(s));
        }


    }

}
