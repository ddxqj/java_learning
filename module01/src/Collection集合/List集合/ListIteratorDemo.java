package Collection集合.List集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> Lit = list.listIterator();
        while(Lit.hasNext()){
            String s=Lit.next();
            System.out.println(s);
            if(s.equals("hello")){
                Lit.add("javaee");
            }
        }
        System.out.println("----");
        while(Lit.hasPrevious()){
            String s=Lit.previous();
            System.out.println(s);
        }
        System.out.println("----");
        while(Lit.hasNext()){
            String s=Lit.next();
            System.out.println(s);
        }
    }
}
