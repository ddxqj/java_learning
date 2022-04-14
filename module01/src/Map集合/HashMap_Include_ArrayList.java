package Map集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMap_Include_ArrayList {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm=new HashMap<>();

        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("liubei");
        arr1.add("guanyu");

        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("sunwukong");
        arr2.add("zhubajie");

        ArrayList<String> arr3=new ArrayList<>();
        arr3.add("songjiang");
        arr3.add("wusong");

        hm.put("三国",arr1);
        hm.put("西游记",arr2);
        hm.put("水浒传",arr3);

        Set<String> set = hm.keySet();
        for (String s : set) {
            ArrayList<String> list = hm.get(s);
            for (String s1 : list) {
                System.out.println(s+" "+s1);
            }

        }


    }
}
