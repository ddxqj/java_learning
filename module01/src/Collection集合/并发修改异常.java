package Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 并发修改异常 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("hello")) {
                c.add("world");
            }

        }
        //c.remove("hello");
        //c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains("hello"));
        System.out.println(c);

    }
}
