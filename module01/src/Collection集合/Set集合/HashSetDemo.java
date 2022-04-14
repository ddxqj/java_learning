package Collection集合.Set集合;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");
        System.out.println(hs);

        for (String h : hs) {
            System.out.println(h);
        }
    }
}
