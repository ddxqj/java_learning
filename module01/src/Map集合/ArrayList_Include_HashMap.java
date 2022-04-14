package Map集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayList_Include_HashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<>();

        HashMap<String,String> h1=new HashMap<>();
        h1.put("1","liubei");
        h1.put("2","guanyu");


        HashMap<String,String> h2=new HashMap<>();
        h2.put("3","zhangfei");
        h2.put("4","zhaoyun");


        HashMap<String,String> h3=new HashMap<>();
        h3.put("5","machao");
        h3.put("6","huangzhong");

        array.add(h1);
        array.add(h2);
        array.add(h3);

        for (int i = 0; i < array.size(); i++) {
            HashMap<String, String> map = array.get(i);
            Set<String> set = map.keySet();
            for (String s : set) {
                System.out.println(s+" "+map.get(s));
            }
        }

    }
}
