package Collection集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(40);

        //Collections.sort(list);
        //Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
