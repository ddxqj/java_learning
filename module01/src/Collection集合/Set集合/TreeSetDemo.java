package Collection集合.Set集合;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(40);
        for (Integer t : ts) {
            System.out.println(t);
        }
    }
}
