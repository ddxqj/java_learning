package Collection集合.List集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList_LinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

//        for (String s:arrayList) {
//            System.out.println(s);
//        }
        Iterator<String> it=arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for(int i=0;i<linkedList.size();i++){
            String s=linkedList.get(i);
            System.out.println(s);
        }
    }
}
