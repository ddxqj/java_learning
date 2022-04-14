package Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("01","liubei");
        map.put("02","guanyu");
        map.put("03","zhangfei");
        map.put("01","zhaoyun");//修改键“01”处的值

        System.out.println(map.get("01"));
        System.out.println(map.get("00"));

        Set<String> set=map.keySet();
        System.out.println(set);

        Collection<String> collection =map.values();
        System.out.println(collection);

        Set<Map.Entry<String,String>> s =map.entrySet();
        System.out.println(s);
//        map.clear();
//        map.remove("01");
//        System.out.println(map.isEmpty());
//        System.out.println(map.containsKey("01"));
//        System.out.println(map.containsValue("guanyu"));
//        System.out.println(map.size());
        System.out.println(map);

        for(String i:set){
            System.out.println(i+" "+map.get(i));
        }

        for (Map.Entry<String, String> entry : s) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
