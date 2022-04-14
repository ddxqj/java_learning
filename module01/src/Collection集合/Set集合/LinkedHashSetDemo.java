package Collection集合.Set集合;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        lhs.add("world");

        System.out.println(lhs);
        for (String lh : lhs) {
            System.out.println(lh);
        }
    }
}
