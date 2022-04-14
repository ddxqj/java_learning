package Arraylist;

import java.util.ArrayList;

public class ArrayList构造 {
    public static void main(String[] args) {
        //ArrayList<String> arrlist = new ArrayList<>();
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("world");
        arrlist.add(0,"hello");

        System.out.println(arrlist);
    }
}
