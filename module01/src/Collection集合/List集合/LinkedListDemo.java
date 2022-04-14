package Collection集合.List集合;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.addFirst("hello");
        linkedList.addLast("world");
        linkedList.add("java");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

    }
}
